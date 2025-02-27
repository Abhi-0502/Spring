package com.xworkz.books.service;

import com.xworkz.books.dao.BookDao;
import com.xworkz.books.dto.Bookdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    boolean isvalidated = false;

    @Override
    public boolean validAndSave(Bookdto bookdto) {
        if (bookdto != null) {
            if (bookdto.getBookName() != null && !bookdto.getBookName().isEmpty()) {
                System.out.println("Name validated");
                bookDao.save(bookdto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public Bookdto getUserById(int id) {
        return bookDao.getUserById(id);
    }


    @Override
    public List<Bookdto> getAllDetails(Bookdto bookdto) {
        return bookDao.getAllDetails(bookdto);
    }

    @Override
    public void updateUserById(int id, Bookdto newUserData) {
        bookDao.updateUserById(id, newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return bookDao.DeleteUserById(id);
    }

    @Override
    public String getbookAuthorById(int id) {
        return bookDao.getbookAuthorById(id);
    }

    @Override
    public Integer getpublishingYearById(int id) {
        return bookDao.getpublishingYearById(id);
    }

    @Override
    public String getBookNameById(int id) {
        return bookDao.getBookNameById(id);
    }

    @Override
    public Object[] getbookAuthorAndbookNameById(int id) {
        Object[] object = null;
        if (id > 0) {
            object = bookDao.getbookAuthorAndbookNameById(id);
        }
        return object;
    }

    @Override
    public Object[] getbookNameAndpublishingYearById(int id) {
        Object[] object = null;
        if (id > 0) {
            object = bookDao.getbookNameAndpublishingYearById(id);
        }
        return object;
    }
    @Override
   public List<Object[]> getbookAuthorAndbookName(){
        return bookDao.getbookAuthorAndbookName();
    }
}
