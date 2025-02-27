package com.xworkz.app.reposistory;

import com.xworkz.app.dto.MovieDto;

import java.util.List;

public interface MoviesReposistory {


    boolean save(MovieDto movieDto);

    MovieDto getMovieById(int id);

    List<MovieDto> getAllDetails();

    boolean updateUserById( MovieDto newUserData);

    boolean DeleteUserById(int id);
}
