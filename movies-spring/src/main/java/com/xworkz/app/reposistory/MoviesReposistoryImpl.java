package com.xworkz.app.reposistory;

import com.xworkz.app.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MoviesReposistoryImpl implements MoviesReposistory {


    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(MovieDto movieDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(movieDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public MovieDto getMovieById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        MovieDto movieDto = entityManager.find(MovieDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return movieDto;
    }

    @Override
    public List<MovieDto> getAllDetails() {
    return factory.createEntityManager().createNamedQuery("getAllDetails").getResultList();
    }

    @Override
    public boolean
    updateUserById( MovieDto movieDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(movieDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("DeleteUserById");
        query.setParameter("id", id); // Set the ID parameter
        int rowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (rowsDeleted > 0)
            return true;
        entityManager.close();
        return false;
    }
}
