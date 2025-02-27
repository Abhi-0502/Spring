package com.xworkz.movies.service;

import com.xworkz.movies.dao.MovieDao;
import com.xworkz.movies.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieDao movieDao;
    boolean isvalidated = false;

    @Override
    public boolean save(MovieDto movieDto) {
        if(movieDto !=null){
            if(movieDto.getMovieName() != null && !movieDto.getMovieName().isEmpty()){
                System.out.println("Movie Name validated");
                movieDao.save(movieDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public MovieDto getUserById(int id) {
        return movieDao.getUserById(id);
    }

    @Override
    public List<MovieDto> getAllDetails(MovieDto movieDto) {
        return movieDao.getAllDetails(movieDto);
    }

    @Override
    public void updateUserById(int id, MovieDto newUserData) {
        movieDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return movieDao.DeleteUserById(id);
    }

    @Override
    public String getmovieNameById(int id) {
        return movieDao.getmovieNameById(id);
    }

    @Override
    public String getlanguageById(int id) {
        return movieDao.getlanguageById(id);
    }

    @Override
    public Object[] getgenreAnddirectorById(int id) {
        Object object[] = null;
        if (id>0){
            object = movieDao.getgenreAnddirectorById(id);
        }
        return object;
    }

    @Override
    public Object[] getheroAndmovieNameById(int id) {
        Object object[] = null;
        if (id>0){
            object = movieDao.getheroAndmovieNameById(id);
        }
        return object;
    }

    @Override
    public Object[] getheroAndheroinById(int id) {
        Object object[] = null;
        if (id>0){
            object = movieDao.getheroAndheroinById(id);
        }
        return object;
    }
}
