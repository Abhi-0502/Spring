package com.xworkz.books.runner;

import com.xworkz.books.config.BSpringConfiguration;
import com.xworkz.books.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BSpringConfiguration.class);

        BookService bookService = applicationContext.getBean(BookService.class);

        int id = 2;
        String bookAuthorById = bookService.getbookAuthorById(id);
        System.out.println("bookAuthorById" + bookAuthorById);

        Integer bookId = 1; // Ensure this is an Integer
        Integer publishingYear = bookService.getpublishingYearById(bookId);
        System.out.println("Publishing Year: " + publishingYear);

        int id2 = 3;
        String bookname = bookService.getBookNameById(id2);
        System.out.println("bookname" + bookname);

        Object[] objects = bookService.getbookNameAndpublishingYearById(2);
        Arrays.asList(objects).forEach(System.out::println);

        Object[] object = bookService.getbookAuthorAndbookNameById(4);
        Arrays.asList(object).forEach(System.out::println);
        System.out.println("------------------------------------");
        List<Object[]> ref=bookService.getbookAuthorAndbookName();
        for(Object[] re:ref){
            for (Object r:re) {
                System.out.println(r);
            }
        }
    }
}
