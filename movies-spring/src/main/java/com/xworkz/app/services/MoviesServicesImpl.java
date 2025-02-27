package com.xworkz.app.services;

import com.xworkz.app.dto.MovieDto;
import com.xworkz.app.reposistory.MoviesReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServicesImpl implements MoviesServices{

    @Autowired
    private MoviesReposistory moviesReposistory;
    boolean isvalidated = false;

    @Override
    public boolean save(MovieDto movieDto) {
        if(movieDto !=null){
            if(movieDto.getMovieName() != null && !movieDto.getMovieName().isEmpty()){
                System.out.println("Movie Name validated");
                moviesReposistory.save(movieDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public MovieDto getMovieById(int id) {
        return moviesReposistory.getMovieById(id);
    }

    @Override
    public List<MovieDto> getAllDetails() {
        return moviesReposistory.getAllDetails();
    }

    @Override
    public boolean updateUserById( MovieDto movieDto) {
       return moviesReposistory.updateUserById(movieDto);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return moviesReposistory.DeleteUserById(id);
    }


}
