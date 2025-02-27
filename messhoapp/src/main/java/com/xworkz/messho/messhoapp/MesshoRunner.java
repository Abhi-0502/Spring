package com.xworkz.messho.messhoapp;

import com.xworkz.messho.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MesshoRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

    MesshoApp messho = applicationContext.getBean(MesshoApp.class);


        MesshoApp messhoApp= new MesshoApp();
        messhoApp.Id = 1;
        messhoApp.Name = "Mobile";
        System.out.println( messhoApp.Id + " "+   messhoApp.Name);

        MesshoApp messhoApp1 = new MesshoApp();
        messhoApp1.Id = 2;
        messhoApp1.Name = "Dress";
        System.out.println( messhoApp1.Id + " "+   messhoApp1.Name);

        System.out.println(messhoApp);
        System.out.println(messhoApp1);

        MesshoApp messhoApp3 = new MesshoApp();
        messhoApp3.Id = 3;
        messhoApp3.price = "price";
        System.out.println( messhoApp3.Id + " "+   messhoApp3.price);
        System.out.println(messhoApp3);


    }
}
