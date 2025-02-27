package com.xworkz.playstoreapp.reposistory;

import com.xworkz.playstoreapp.dto.PlayStoreDto;

import java.util.List;

public interface PlayStoreReposistory {


    boolean addPlayStore(PlayStoreDto playStoreDto);
    PlayStoreDto getProductById(int id);
    List<PlayStoreDto> getAllUser();
    boolean deleteUserById(int id);
    boolean UpdateUser(PlayStoreDto playStoreDto);
}
