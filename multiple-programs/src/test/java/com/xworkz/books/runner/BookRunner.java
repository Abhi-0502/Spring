package com.xworkz.books.runner;

import com.xworkz.books.config.BSpringConfiguration;
import com.xworkz.books.dto.Bookdto;
import com.xworkz.books.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BookRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BSpringConfiguration.class);

        Bookdto bookdto = new Bookdto();
        BookService bookService = applicationContext.getBean(BookService.class);

        //valid and save
        bookdto.setBookName("Treasure Island");
        bookdto.setAuthorname("Stevenson");
        bookdto.setPublishingYear(1786);
        bookService.validAndSave(bookdto);
        System.out.println("Added successfully");

        //get by id
        Bookdto getbyId = bookService.getUserById(1);
        System.out.println(getbyId);

        //get all the details;
        List<Bookdto> bookdtoList = bookService.getAllDetails(bookdto);
        System.out.println(bookdtoList);

        //update the details by id;
        Bookdto updateValue = new Bookdto();
        updateValue.setBookName("Moby-Dick");
        updateValue.setAuthorname("Herman Melville");
        updateValue.setPublishingYear(1851);
        bookService.updateUserById(7,updateValue);
        System.out.println("Updated successfully...!!");

        //delete operation;
        bookService.DeleteUserById(3);
        System.out.println("Row deleted");
    }
}
