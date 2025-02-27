package com.xworkz.paytm.reposistory;

import com.xworkz.paytm.dto.PaytmDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class PaytmReposistoryImpl implements PaytmReposistory {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean Validateandsave(PaytmDto paytmDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(paytmDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public List<PaytmDto> getAllUser() {
      return entityManagerFactory.createEntityManager().createNamedQuery("getAllUser").getResultList();
    }

    @Override
    public boolean getdeleteById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("getDeleteById");
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
    public PaytmDto getPaytmById(int id) {
        System.out.println("Dao is Running");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        PaytmDto Dto = entityManager.find(PaytmDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto ;
    }


    @Override
    public boolean UpdatePaytmUser(PaytmDto paytmDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(paytmDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
