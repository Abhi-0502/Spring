package com.xworkz.registration.repository;
import com.xworkz.registration.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Repository
@Slf4j
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    EntityManagerFactory factory;

    @Override
    public boolean save(UserEntity entity) {
        log.info("The registered details: {}", entity);
        log.info("Save method started");
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createNamedQuery("emailVerify");
        query.setParameter("emailVerify",entity.getEmail());
        long count = (long) query.getSingleResult();
        if(count>0){
            System.out.println("Email exist");
            return false;
        }
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        //ORM
        entityManager.close();
        return true;
    }
@Override
public UserEntity findByEmailAndPassword(String email, String password) {
    try {
        if (email != null && password != null) {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("findByEmailAndPassword", UserEntity.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            return (UserEntity) query.getSingleResult();
        }
    } catch (Exception e) {
        log.info("Error during findByEmailAndPassword: {}", e.getMessage());
    }
    return null;
}

    @Override
    public UserEntity findById(int id) {
        return (UserEntity) factory.createEntityManager().createNamedQuery("findById").
                setParameter("id",id).getSingleResult();
        }

    @Override
    public UserEntity updateProfileData(UserEntity userEntity) {
        EntityManager entityManager = factory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            UserEntity user = entityManager.merge(userEntity);
            entityManager.getTransaction().commit();
            return user;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return userEntity;
    }
    public boolean checkEmail(String email) {
        log.info("Check Email started");
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("emailVerify");
            query.setParameter("emailVerify", email);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } catch (Exception e) {
            log.error("Exception occurred: {}", e.getMessage());
        }
        return false;
    }

    @Override
    public boolean checkContact(Long number) {
        log.info("Check phone number started");
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("numberVerify");
            query.setParameter("number", number);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } catch (Exception e) {
            log.error("Exception occurred: {}", e.getMessage());
        }
        return false;
    }

    @Override
    public boolean updatePassword(String email, String newPassword, String confirmPassword) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updatePasswordByEmail");
        query.setParameter("email", email);
        query.setParameter("newPassword", newPassword);
        query.setParameter("confirmPassword", confirmPassword);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        return true;
    }
}
