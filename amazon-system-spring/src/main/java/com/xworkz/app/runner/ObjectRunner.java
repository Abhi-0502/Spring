package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.service.AmazonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        AmazonService amazonService = applicationContext.getBean(AmazonService.class);

        int id = 3;
        String productname = amazonService.getproductNameById(id);
        System.out.println("for id"+ "the productname found is" + productname);
        System.out.println(".................................");

        int id1 = 3;
        String price = amazonService.getProductPriceById(id1);
        System.out.println("for id"+ "the price found is" + price);
        System.out.println(".................................");


        int id2 = 3;
        String quality = amazonService.getProductQualityById(id2);
        System.out.println("for id"+ "the quality found is" + productname);
        System.out.println(".................................");


        Object[] objects = amazonService.getproductNameAndqualitybyId(4);
        Arrays.asList(objects).forEach(System.out::println);
        System.out.println(".................................");


        Object[] objects1 = amazonService.getpriceAndNameById(3);
        Arrays.stream(objects1).forEach(System.out::println);
        System.out.println(".................................");



    }
}
