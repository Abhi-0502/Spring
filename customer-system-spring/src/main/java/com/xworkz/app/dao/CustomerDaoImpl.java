package com.xworkz.app.dao;

import com.xworkz.app.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private EntityManagerFactory factory;


    @Override
    public boolean save(CustomerDto customerDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customerDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public CustomerDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CustomerDto Dto = entityManager.find(CustomerDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto;
    }

    @Override
    public List<CustomerDto> getAllDetails(CustomerDto customerDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from CustomerDto user");
        List<CustomerDto> Dtos = query.getResultList();
        return Dtos;
    }

    @Override
    public void updateUserById(int id, CustomerDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CustomerDto dto = entityManager.find(CustomerDto.class,id);
        if(dto != null){
            dto.setId(dto.getId());
            dto.setCustomerName(dto.getCustomerName());
            dto.setEmail(dto.getEmail());
            dto.setCustomerNo(dto.getCustomerNo());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from CustomerDto dto where dto.id =: id");
        query.setParameter("id",id);
        int rowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowsDeleted > 0;
    }

    @Override
    public String getcustomerNameById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//      //  Query query = entityManager.createQuery("select customer.customerName from CustomerDto  customer where customer.id = :i");
//        query.setParameter("i",id);
//        String name = (String) query.getSingleResult();
//        return name;
        return (String) factory.createEntityManager().createNamedQuery("getcustomerNameById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public String getemailById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//       // Query query = entityManager.createQuery("select customer.customerName from CustomerDto  customer where customer.id = :i");
//        Query query = entityManager.createQuery("getemailById");
//        query.setParameter("i",id);
//        String name = (String) query.getSingleResult();
//        return name;
        return (String) factory.createEntityManager().createNamedQuery("getemailById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Integer getcustomerNoById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//         //Query query = entityManager.createQuery("select customer.customerNo from CustomerDto  customer where customer.id = :i");
//        Query query = entityManager.createQuery(" getcustomerNoById");
//        query.setParameter("i",id);
//        Integer customerNo = (Integer) query.getSingleResult();
//        return customerNo;
        return (Integer) factory.createEntityManager().createNamedQuery("getcustomerNoById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getCustomerNameAndemailById(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getCustomerNameAndemailById").
               setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getcustomerNoAndnameById(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getcustomerNoAndnameById").
                setParameter("id",id).getSingleResult();
    }
}

