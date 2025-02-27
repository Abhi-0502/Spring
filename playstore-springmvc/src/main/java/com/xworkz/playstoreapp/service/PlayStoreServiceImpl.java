package com.xworkz.playstoreapp.service;

import com.xworkz.playstoreapp.dto.PlayStoreDto;
import com.xworkz.playstoreapp.reposistory.PlayStoreReposistory;
import com.xworkz.playstoreapp.reposistory.PlayStoreReposistoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class PlayStoreServiceImpl implements PlayStoreService{

@Autowired
PlayStoreReposistoryImpl playStoreReposistory;

    public PlayStoreServiceImpl(){
        System.out.println("PlayStoreServiceImpl invoked");
    }
    @Override
    public boolean addPlayStore(PlayStoreDto playStoreDto) {
        if (playStoreDto != null){
            System.out.println("addplaystore details added");
        }
        return playStoreReposistory.addPlayStore(playStoreDto);
    }

    @Override
    public PlayStoreDto getProductById(int id) {
        return playStoreReposistory.getProductById(id);
    }

    @Override
    public List<PlayStoreDto> getAllUser() {
        return playStoreReposistory.getAllUser();
    }

    @Override
    public boolean deleteUserById(int id) {
        return playStoreReposistory.deleteUserById(id);
    }

    @Override
    public boolean UpdateUser(PlayStoreDto playStoreDto) {
        return playStoreReposistory.UpdateUser(playStoreDto);
    }
}
