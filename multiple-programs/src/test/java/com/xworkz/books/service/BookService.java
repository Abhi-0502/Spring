package com.xworkz.books.service;

import com.xworkz.books.dto.Bookdto;

import java.util.List;

public interface BookService {

    boolean validAndSave(Bookdto bookdto);

    Bookdto getUserById(int id);

    List<Bookdto> getAllDetails(Bookdto bookdto);

    void updateUserById(int id, Bookdto newUserData);

    boolean DeleteUserById(int id);

    String getbookAuthorById(int id);

    Integer getpublishingYearById(int id);

    String getBookNameById(int id);

    Object[] getbookAuthorAndbookNameById(int id);

    Object[] getbookNameAndpublishingYearById(int id);
    List<Object[]> getbookAuthorAndbookName();


}
