package com.xworkz.app.dao;

import com.xworkz.app.dto.AmazonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Component
public class AmazonDaoImpl implements AmazonDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(AmazonDto amazonDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(amazonDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public void UpdateProductId(int id, AmazonDto amazonDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        AmazonDto dto = entityManager.find(AmazonDto.class,id);
        if(dto != null){
            dto.setId(dto.getId());
            dto.setProductName(dto.getProductName());
            dto.setProductQuality(dto.getProductQuality());
            dto.setProductPrice(dto.getProductPrice());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean deleteProductId(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from AmazonDto dto where id = :id");
        query.setParameter("id",id);
        int noOfRowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsDeleted > 0)

            return true;
        entityManager.close();
        return false;
    }

    @Override
    public AmazonDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        AmazonDto Dto = entityManager.find(AmazonDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto;
    }

    @Override
    public List<AmazonDto> getAllDetails(AmazonDto amazonDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from AmazonDto user");
        List<AmazonDto> Dtos = query.getResultList();
        return Dtos;
    }

    @Override
    public String getproductNameById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("getproductNameById");
        query.setParameter("i",id);
        String name = (String) query.getSingleResult();

        return name;
    }

    @Override
    public String getProductQualityById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("getProductQualityById");
        query.setParameter("i",id);
        String name = (String) query.getSingleResult();

        return name;
    }

    @Override
    public String getProductPriceById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("getProductPriceById");
        query.setParameter("i",id);
        String price = (String) query.getSingleResult();

        return price;
    }

    @Override
    public Object[] getproductNameAndqualitybyId(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getproductNameAndqualitybyId").
   setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getpriceAndNameById(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getpriceAndNameById").
                setParameter("i",id).getSingleResult();
    }
}
