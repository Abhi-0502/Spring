package com.xworkz.app.dao;

import com.xworkz.app.dto.PlayStoreDto;

import java.util.List;

public interface PlayStoreDao {

    boolean save(PlayStoreDto playStoreDto);
    void UpdatePlayStoreId(int id ,PlayStoreDto playStoreDto);
    boolean deletePlayStoreId(int id);
    PlayStoreDto getUserById(int id);
    List<PlayStoreDto> getAllDetails(PlayStoreDto playStoreDto);
    String getversionById(int id);
     Object[] getdownloadAndVersionById(int id);
     String getofferedById(int id);
     String getreleasedOnById(int id);
     Object[] getofferedAndreleasedOnById(int id);

}
