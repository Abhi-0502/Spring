package com.xworkz.movies.runner;

import com.xworkz.movies.config.SpringConfiguration;
import com.xworkz.movies.service.MovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MovieService movieService = applicationContext.getBean(MovieService.class);

        int id = 3;
        String moviename= movieService.getmovieNameById(id);
        System.out.println("for id"+ "the moviename found is" + moviename);
        System.out.println("............................................");

        int id1 = 3;
        String language= movieService.getlanguageById(id);
        System.out.println("for id"+ "the language found is" + language);
        System.out.println("............................................");

        Object[] objects = movieService.getgenreAnddirectorById(4);
        Arrays.asList(objects).forEach(System.out::println);
        System.out.println("............................................");

        Object[] objects1 = movieService.getheroAndmovieNameById(5);
        Arrays.stream(objects1).forEach(System.out::println);
        System.out.println("............................................");

        Object[] object2 = movieService.getheroAndheroinById(5);
        Arrays.asList(object2).forEach(System.out::println);
        System.out.println("............................................");


    }
}
