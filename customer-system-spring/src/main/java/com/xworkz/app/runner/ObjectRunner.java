package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        int id = 3;
        String customerName = customerService.getcustomerNameById(id);
        System.out.println("for id" + "the customerName found is" + customerName);
        System.out.println("......................................");

        int id2 = 3;
        String email = customerService.getemailById(id2);
        System.out.println("for id" + "the email found is" + email);
        System.out.println("......................................");

        int id1 = 2;
        Integer customerNo = customerService.getcustomerNoById(id1);
        System.out.println("for id" + "the customerNo found is" + customerNo);
        System.out.println("......................................");

        Object[] objects = customerService.getcustomerNoAndnameById(4);
        Arrays.asList(objects).forEach(System.out::println);
        System.out.println(".....................");

        Object[] object = customerService.getCustomerNameAndemailById(5);
        Arrays.asList(object).forEach(System.out::println);
        System.out.println("...........................");


    }
}
