package com.xworkz.app.services;

import com.xworkz.app.dto.MovieDto;

import java.util.List;

public interface MoviesServices {


    boolean save(MovieDto movieDto);

    MovieDto getMovieById(int id);

    List<MovieDto> getAllDetails();

    boolean updateUserById( MovieDto newUserData);

    boolean DeleteUserById(int id);
}
