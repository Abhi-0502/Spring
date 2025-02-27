package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectById {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        ProductService productService = applicationContext.getBean(ProductService.class);

        int id = 2;
        String userName = productService.getUserNameById(id);
        System.out.println("for id"+ "the userName found is" + userName);
        System.out.println(".....................................................");

        Object[] objects = productService.getUserNameAndcategoryById(4);
        System.out.println("getUserNameAndcategoryById"+ objects);
        Arrays.asList(objects).forEach(System.out::println);
        System.out.println(".........................................");

        Object[] objects1 = productService.getcategoryAndproductNoById(id);
        System.out.println("getcategoryAndproductNoById" + objects1);
        Arrays.asList(objects1).forEach(System.out::println);
        System.out.println("........................................");

        int id1 = 1;
        String category = productService.getCategoryById(id1);
        System.out.println("for id"+ "the category found is" + category);
        System.out.println("...................................................");

//        int id2 = 1;
//        String productNo = productService.getproductNoById(id2);
//        System.out.println("for id"+ "the productNo found is" + productNo);



    }
}
