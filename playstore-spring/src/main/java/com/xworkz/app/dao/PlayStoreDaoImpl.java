package com.xworkz.app.dao;

import com.xworkz.app.dto.PlayStoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Component
public class PlayStoreDaoImpl implements PlayStoreDao {

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(PlayStoreDto playStoreDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        //entityManager.persist(playStoreDto);
        entityManager.merge(playStoreDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public void UpdatePlayStoreId(int id, PlayStoreDto playStoreDto) {

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        PlayStoreDto dto = entityManager.find(PlayStoreDto.class, id);
        if (dto != null) {
            dto.setId(dto.getId());
            dto.setDownloads(dto.getDownloads());
            dto.setVersion(dto.getVersion());
            dto.setDownloadSize(dto.getDownloadSize());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean deletePlayStoreId(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from PlayStoreDto dto where id = :id");
        query.setParameter("id", id);
        int noOfRowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsDeleted > 0)

            return true;
        entityManager.close();
        return false;
    }

    @Override
    public PlayStoreDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        PlayStoreDto Dto = entityManager.find(PlayStoreDto.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto;
    }

    @Override
    public List<PlayStoreDto> getAllDetails(PlayStoreDto playStoreDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from PlayStoreDto user");
        List<PlayStoreDto> Dtos = query.getResultList();
        return Dtos;
    }

    @Override
    public String getversionById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
            Query query=entityManager.createNamedQuery("getversionById");
               query .setParameter("i", id);
        String version = (String) query.getSingleResult();
        return version;
    }


    @Override
    public Object[] getdownloadAndVersionById(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getdownloadAndVersionById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public String getofferedById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("getofferedById");
        query .setParameter("i", id);
        String offeredBy = (String) query.getSingleResult();
        return offeredBy;
    }

    @Override
    public String getreleasedOnById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("getreleasedOnById");
        query .setParameter("i", id);
        String releasedOn = (String) query.getSingleResult();
        return releasedOn;
    }

    @Override
    public Object[] getofferedAndreleasedOnById(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getofferedAndreleasedOnById").
                setParameter("id",id).getSingleResult();
    }
}
