package com.bhive.business.repository;

import com.bhive.business.entity.RequirementEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class RequirementDaoImpl implements RequirementDao{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    private  RequirementEntity requirementEntity;

    @Override
    public boolean Save(RequirementEntity requirementEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(requirementEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
