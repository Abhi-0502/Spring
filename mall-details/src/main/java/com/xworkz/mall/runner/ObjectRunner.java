package com.xworkz.mall.runner;

import com.xworkz.mall.config.SpringConfiguration;
import com.xworkz.mall.service.MallService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MallService mallService = applicationContext.getBean(MallService.class);


        int id = 2;
        String mallName = mallService.getmallNameById(id);
        System.out.println("for id" + "the mallName found is" + mallName);
        System.out.println(".............................");

        int id1 = 1;
        String city = mallService.getCityById(id1);
        System.out.println("for id" + "the city found is" + city);
        System.out.println("...............................................");

        int id2 = 3;
        String mallArea = mallService.getmallAreaById(id);
        System.out.println("for id" + "the mallArea found is" + mallArea);
        System.out.println(".....................................................");

        Object[] objects = mallService.getmallareaAndnoOfFloorById(2);
        Arrays.asList(objects).forEach(System.out::println);
        System.out.println(".............................................");

        Object[] objects1 = mallService.getmallnameAndCityById(1);
        Arrays.stream(objects1).forEach(System.out::println);
        System.out.println("............................................Z");
    }
}
