package com.xworkz.movies.dao;

import com.xworkz.books.dto.Bookdto;
import com.xworkz.movies.dto.MovieDto;

import java.util.List;

public interface MovieDao {

    boolean save(MovieDto movieDto);

    MovieDto getUserById(int id);

    List<MovieDto> getAllDetails(MovieDto movieDto);

    void updateUserById(int id, MovieDto newUserData);

    boolean DeleteUserById(int id);

    String getmovieNameById(int id);

    String getlanguageById(int id);

    Object[] getgenreAnddirectorById(int id);

    Object[] getheroAndmovieNameById(int id);

    Object[] getheroAndheroinById(int id);
}
