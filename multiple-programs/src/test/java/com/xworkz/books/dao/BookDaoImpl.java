package com.xworkz.books.dao;

import com.xworkz.books.dto.Bookdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Component
public class BookDaoImpl implements BookDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(Bookdto bookdto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bookdto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public Bookdto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Bookdto bookdto = entityManager.find(Bookdto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return bookdto;
    }

    @Override
    public List<Bookdto> getAllDetails(Bookdto bookdto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from Bookdto user");
        List<Bookdto> bookdtos = query.getResultList();
        return bookdtos;
    }

    @Override
    public void updateUserById(int id, Bookdto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Bookdto existing = entityManager.find(Bookdto.class,id);
        if(existing != null){
            existing.setBookName(newUserData.getBookName());
            existing.setAuthorname(newUserData.getAuthorname());
            existing.setPublishingYear(newUserData.getPublishingYear());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("delete from Bookdto dto where dto.id =: id");
//        query.setParameter("id",id);
//        int rowEffected = query.executeUpdate();
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return rowEffected > 0;
        return (boolean) factory.createEntityManager().createNamedQuery("DeleteUserById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public String getbookAuthorById(int id) {
//        return (String) factory.createEntityManager().createQuery("select books.authorname from Bookdto  books where books.id = :i").
//                setParameter("i",id).getSingleResult();
        return (String) factory.createEntityManager().createNamedQuery("getbookAuthorById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public Integer getpublishingYearById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        String hql = "select books.publishingYear from com.xworkz.books.dto.Bookdto books where books.id = :id";
//        Query query = entityManager.createQuery(hql);
//        query.setParameter("id", id); // Ensure this matches the expected type
//        return (Integer) query.getSingleResult();
        return (Integer) factory.createEntityManager().createNamedQuery("getpublishingYearById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public String getBookNameById(int id) {
//        return (String) factory.createEntityManager().createQuery("select books.bookName from Bookdto books where books.id=:i").
//                setParameter("i",id).getSingleResult();
        return (String) factory.createEntityManager().createNamedQuery("getBookNameById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getbookAuthorAndbookNameById(int id) {
//        EntityManager entityManager= factory.createEntityManager();
//        String hql = "select books.authorname, books.bookName from com.xworkz.books.dto.Bookdto books where books.id = :id";
//        Query query = entityManager.createQuery(hql);
//        query.setParameter("id", id);
//        Object[] result = (Object[]) query.getSingleResult();
//        String authorname = (String) result[0];
//        String bookName = (String) result[1];
//        return new String[]{authorname, bookName};
        return (Object[]) factory.createEntityManager().createNamedQuery("getbookAuthorAndbookNameById").
                setParameter("id",id).getSingleResult();

    }

    @Override
    public Object[] getbookNameAndpublishingYearById(int id) {
//        EntityManager entityManager= factory.createEntityManager();
//        String hql = "select books.authorname, books.bookName from com.xworkz.books.dto.Bookdto books where books.id = :id";
//        Query query = entityManager.createQuery(hql);
//        query.setParameter("id", id);
//        return (Object[]) query.getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getbookNameAndpublishingYearById").
                setParameter("id",id).getSingleResult();
    }

    @Override
    public List<Object[]> getbookAuthorAndbookName() {
        return factory.createEntityManager().createQuery("select b.bookName,b.authorname from  Bookdto b").getResultList();
    }
}
