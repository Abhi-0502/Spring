package com.xworkz.medisales.repository;

import com.xworkz.medisales.entity.MediSalesEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Slf4j
@Repository
public class MediSalesDaoImpl implements MediSalesDao{

    @Autowired
    EntityManagerFactory factory;
    private MediSalesEntity mediSalesEntity;

    @Override
    public boolean Save(MediSalesEntity mediSalesEntity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mediSalesEntity);
        entityManager.close();
        return true;

    }

    @Override
    public boolean findByEmail(String email) {
        log.info("Checking if email exists: {}", email);
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("findByemail");
            query.setParameter("email", email);
            Long count = (Long) query.getSingleResult();
            return count > 0; // If count is all you need, this is fine.
        } catch (Exception e) {
            log.error("Error checking email existence: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public MediSalesEntity findByEmailAnd(String email) {
        log.info("Finding user by email: {}", email);
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("findByEmailAnd", MediSalesEntity.class);
            query.setParameter("email", email);
            return (MediSalesEntity) query.getSingleResult();
        } catch (NoResultException e) {
            log.info("No user found with email: {}", email);
            return null;
        } catch (Exception e) {
            log.error("Error finding user by email: {}", e.getMessage());
            return null;
        }
    }
    @Override
    public MediSalesEntity checkEmail(String email) {
        log.info("Checking email: {}", email);
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("findByEmailAnd", MediSalesEntity.class); // Use the correct query
            query.setParameter("email", email);
            return (MediSalesEntity) query.getSingleResult();
        } catch (NoResultException e) {
            log.info("No user found for email: {}", email);
            return null;
        } catch (Exception e) {
            log.error("Error checking email: {}", e.getMessage());
            return null;
        }
    }

}
