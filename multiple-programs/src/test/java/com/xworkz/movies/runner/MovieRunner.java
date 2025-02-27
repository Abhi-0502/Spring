package com.xworkz.movies.runner;

import com.xworkz.movies.config.SpringConfiguration;
import com.xworkz.movies.dto.MovieDto;
import com.xworkz.movies.service.MovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MovieDto movieDto = new MovieDto();
        MovieService movieService = applicationContext.getBean(MovieService.class);

//        //validate and save
//        movieDto.setMovieName("Inception");
//        movieDto.setHero("Leonardo DiCaprio");
//        movieDto.setHeroin("Elliot Page");
//        movieDto.setReleaseYear(2010);
//        movieDto.setDirector("Christopher Nolan");
//        movieDto.setDuration(148);
//        movieDto.setGenre("Sci-Fi");
//        movieDto.setRating(8.8);
//        movieDto.setLanguage("English");
//        movieService.save(movieDto);
//        System.out.println("Added successfully");

        //get by id;
        MovieDto getById = movieService.getUserById(5);
        System.out.println(getById);

        //get all details;
        List<MovieDto> movieDtos = movieService.getAllDetails(movieDto);
        System.out.println(movieDtos);
//
//        //update all fields by id;
//        MovieDto updateMovie = new MovieDto();
//        updateMovie.setMovieName("3 Idiots");
//        updateMovie.setHero("Aamir Khan");
//        updateMovie.setHeroin("Kareena Kapoor");
//        updateMovie.setReleaseYear(2009);
//        movieDto.setDirector("Rajkumar Hirani");
//        movieDto.setDuration(170);
//        movieDto.setGenre("Comedy");
//        movieDto.setRating(8.4);
//        movieDto.setLanguage("Hindi");
//        movieService.updateUserById(8,updateMovie);
//        System.out.println("Update successfully...!!");

        //delete by id;
        movieService.DeleteUserById(7);
        System.out.println("Row deleted");
    }
}
