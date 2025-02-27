package com.xworkz.playstoreapp.reposistory;


import com.xworkz.playstoreapp.dto.PlayStoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class PlayStoreReposistoryImpl implements PlayStoreReposistory {


    @Autowired
    EntityManagerFactory entityManagerFactory;

    public PlayStoreReposistoryImpl(){
        System.out.println("PlayStoreReposistoryImpl invoked");
    }


    @Override
    public boolean addPlayStore(PlayStoreDto playStoreDto) {
        System.out.println("Dao is Running");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(playStoreDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public PlayStoreDto getProductById(int id) {
        System.out.println("Dao is Running");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        PlayStoreDto Dto = entityManager.find(PlayStoreDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto ;
    }

    @Override
    public List<PlayStoreDto> getAllUser() {
        return entityManagerFactory.createEntityManager().createNamedQuery("getAllUser").getResultList();
    }

    @Override
    public boolean deleteUserById(int id) {
        System.out.println("Dao is Running");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteUserById");
        query.setParameter("id",id);
        int rowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        if (rowsDeleted > 0)
            return true;
        entityManager.close();
        return false;
    }

    @Override
    public boolean UpdateUser(PlayStoreDto playStoreDto) {
        System.out.println("Dao is Running");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(playStoreDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
