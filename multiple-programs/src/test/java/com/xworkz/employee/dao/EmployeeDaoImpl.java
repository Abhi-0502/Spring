package com.xworkz.employee.dao;

import com.xworkz.employee.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(EmployeeDto employeeDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employeeDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public EmployeeDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        EmployeeDto employeeDto = entityManager.find(EmployeeDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return employeeDto;
    }

    @Override
    public List<EmployeeDto> getAllDetails(EmployeeDto employeeDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from EmployeeDto user");
        List<EmployeeDto> employeeDtos = query.getResultList();
        return employeeDtos;
    }

    @Override
    public void updateUserById(int id, EmployeeDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        EmployeeDto existing = entityManager.find(EmployeeDto.class,id);
        if(existing != null){
            existing.setName(newUserData.getName());
            existing.setEducation(newUserData.getEducation());
            existing.setSalary(newUserData.getSalary());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from EmployeeDto dto where dto.id =: id");
        query.setParameter("id",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowEffected > 0;
    }

    @Override
    public String getEducationbyId(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select employee.education from EmployeeDto  employee where employee.id = :i");
//        query.setParameter("i",id);
//        String education = (String) query.getSingleResult();
//        return education;
        return (String) factory.createEntityManager().createNamedQuery("getEducationbyId").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public String getEmployeNameById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select employee.name from EmployeeDto  employee where employee.id = :i");
//        query.setParameter("i",id);
//        String name = (String) query.getSingleResult();
//        return name;
        return (String) factory.createEntityManager().createNamedQuery("getEmployeNameById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getEmployeNameAndEducationById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select employee.name,employee.education from EmployeeDto employee where employee.id = :id").
//                setParameter("id",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getEmployeNameAndEducationById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getEducationAndNameById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select employee.education,employee.name from EmployeeDto employee where employee.id = :id").
//                setParameter("id",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getEducationAndNameById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public String getSalaryById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select employee.salary from EmployeeDto  employee where employee.id = :i");
//        query.setParameter("i",id);
//        String salary = (String) query.getSingleResult();
//        return salary;
        return (String) factory.createEntityManager().createNamedQuery("getSalaryById").
                setParameter("i",id).getSingleResult();
    }
}
