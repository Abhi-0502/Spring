package com.xworkz.customer.dao;

import com.xworkz.customer.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    @Autowired
    EntityManagerFactory factory;

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
    public List<CustomerDto> getAllUsers() {
        return factory.createEntityManager().createNamedQuery("getAllUsers").getResultList();
    }

    @Override
    public boolean updateUserById(CustomerDto customerDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(customerDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public CustomerDto getById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CustomerDto customerDto = entityManager.find(CustomerDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return customerDto;
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteById");
        query.setParameter("userid",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        if(rowEffected > 0)
            return true;
        return true;
    }
}
