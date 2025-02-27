package com.xworkz.car.runner;


import com.xworkz.car.config.CSpringConfiguration;
import com.xworkz.car.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CSpringConfiguration.class);

        CarService carService = applicationContext.getBean(CarService.class);

        int id = 2;
        String name = carService.getCarNameById(id);
        System.out.println("for id"+ "the name found is" + name);
        System.out.println("........................");

        int id1 = 2;
        String model = carService.getmodelById(id1);
        System.out.println("for id"+ "the model name found is" + model);
        System.out.println("...................................");

//        Integer carId = 1; // Ensure carId is Integer
//        Double price = carService.getpriceById(carId);
//        System.out.println("Car Price: " + price);


        Object[] objects1 = carService.getCarNameAndModelById(4);
        Arrays.stream(objects1).forEach(System.out::println);
        System.out.println("...............................................");

        Object[] objects = carService.getModelpriceAndCarNameById(5);
        Arrays.stream(objects).forEach(System.out::println);
        System.out.println("............................................");

    }
}
