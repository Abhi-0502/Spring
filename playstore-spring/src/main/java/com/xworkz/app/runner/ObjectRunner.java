package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.service.PlayStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        PlayStoreService playStoreService = applicationContext.getBean(PlayStoreService.class);

//        int id = 5;
//       String version = playStoreService.getversionById(id);
//        System.out.println(version);

      Object[] objects = playStoreService.getdownloadAndVersionById(7);
        System.out.println("getdownloadAndVersionById");
      Arrays.stream(objects).forEach(System.out::println);
        System.out.println("...........................................");

        int id = 8;
        String offered = playStoreService.getofferedById(id);
        System.out.println("offered by id"+offered);
        System.out.println("...........................................");

        int id1 = 4;
        String releasedon = playStoreService.getreleasedOnById(id);
        System.out.println("releasedon by id"+offered);
        System.out.println("...........................................");

        Object[] objects1 = playStoreService.getofferedAndreleasedOnById(5);
        System.out.println("getofferedAndreleasedOnById");
        Arrays.stream(objects1).forEach(System.out::println);
        System.out.println(".............................................");




    }
}
