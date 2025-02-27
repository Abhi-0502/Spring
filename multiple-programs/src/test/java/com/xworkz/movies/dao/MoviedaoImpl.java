package com.xworkz.movies.dao;

import com.xworkz.books.dto.Bookdto;
import com.xworkz.movies.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Component
public class MoviedaoImpl implements MovieDao{

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
    public MovieDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        MovieDto movieDto = entityManager.find(MovieDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return movieDto;
    }

    @Override
    public List<MovieDto> getAllDetails(MovieDto movieDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from MovieDto user");
        List<MovieDto> movieDtos = query.getResultList();
        return movieDtos;
    }

    @Override
    public void updateUserById(int id, MovieDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        MovieDto existing = entityManager.find(MovieDto.class,id);
        if(existing != null){
            existing.setMovieName(newUserData.getMovieName());
            existing.setHero(newUserData.getHero());
            existing.setHeroin(newUserData.getHeroin());
            existing.setReleaseYear(newUserData.getReleaseYear());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from MovieDto dto where dto.id =: id");
        query.setParameter("id",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowEffected > 0;
    }

    @Override
    public String getmovieNameById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select movies.movieName from MovieDto  movies where movies.id = :i");
//        query.setParameter("i",id);
//        String movieName = (String) query.getSingleResult();
//
//        return movieName;
        return (String) factory.createEntityManager().createNamedQuery("getmovieNameById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public String getlanguageById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select movies.language from MovieDto  movies where movies.id = :i");
//        query.setParameter("i",id);
//        String language = (String) query.getSingleResult();
//
//        return language;
        return (String) factory.createEntityManager().createNamedQuery("getlanguageById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getgenreAnddirectorById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select movies.genre,movies.director from MovieDto movies where movies.id =:i").
//               setParameter("i",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getgenreAnddirectorById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getheroAndmovieNameById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select movies.hero,movies.movieName from MovieDto movies where movies.id =:i").
//               setParameter("i",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getheroAndmovieNameById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getheroAndheroinById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select movies.hero,movies.heroin from MovieDto movies where movies.id =:i").
//               setParameter("i",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getheroAndheroinById").
                setParameter("id",id).getSingleResult();
    }
}
