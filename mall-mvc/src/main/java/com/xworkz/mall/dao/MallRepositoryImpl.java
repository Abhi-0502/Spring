package com.xworkz.mall.dao;

import com.xworkz.mall.dto.MallDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class MallRepositoryImpl implements MallRepository{

    @Autowired
    EntityManagerFactory factory;

    @Override
    public boolean save(MallDto mallDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mallDto);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public List<MallDto> getAllUsers() {
        return factory.createEntityManager().createNamedQuery("getAllUsers").getResultList();
    }
    @Override
    public boolean updateUserById(MallDto mallDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(mallDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
    @Override
    public MallDto getById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        MallDto mallDto = entityManager.find(MallDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return mallDto;
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
