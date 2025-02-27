package com.xworkz.app.reposistory;

import com.xworkz.app.dto.AmazonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AmazonReposistoryImpl implements AmazonReposistory{

    @Autowired
    EntityManagerFactory entityManagerFactory;
   @Override
    public boolean save(AmazonDto amazonDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(amazonDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public List<AmazonDto> getAllDetails() {
        return entityManagerFactory.createEntityManager().createNamedQuery("getAllDetails").getResultList();
    }

    @Override
    public boolean UpdateProductId(AmazonDto amazonDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(amazonDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
    @Override
    public boolean deleteProductId(int id) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("deleteProductId");
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
    public AmazonDto getProductById(int id) {
        System.out.println("Dao is Running");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        AmazonDto Dto = entityManager.find(AmazonDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto ;
    }
}
