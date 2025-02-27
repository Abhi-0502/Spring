package com.xworkz.playstoreapp.service;

import com.xworkz.playstoreapp.dto.PlayStoreDto;

import java.util.List;

public interface PlayStoreService {


    boolean addPlayStore(PlayStoreDto playStoreDto);
    PlayStoreDto getProductById(int id);
    List<PlayStoreDto> getAllUser();
    boolean deleteUserById(int id);
    boolean UpdateUser(PlayStoreDto playStoreDto);
}
