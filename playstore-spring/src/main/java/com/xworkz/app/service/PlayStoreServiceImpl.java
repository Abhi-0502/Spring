package com.xworkz.app.service;

import com.xworkz.app.dao.PlayStoreDao;
import com.xworkz.app.dto.PlayStoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PlayStoreServiceImpl implements PlayStoreService{

    @Autowired
    private PlayStoreDao playStoreDao;

    @Override
    public boolean saveAndValidate(PlayStoreDto playStoreDto) {
        boolean versionValid = false;
        boolean isdownloads = false;
        if(playStoreDto != null){
            if(playStoreDto.getVersion() != null  && !playStoreDto.getVersion().isEmpty()){
                isdownloads = true;
            }
            if(isdownloads){
                versionValid = playStoreDao.save(playStoreDto);
            }
        }
        return versionValid;
    }

    @Override
    public void UpdatePlayStoreId(int id, PlayStoreDto playStoreDto) {
       playStoreDao.UpdatePlayStoreId(id,playStoreDto);
    }

    @Override
    public boolean deletePlayStoreId(int id) {
        if (id>0){
            System.out.println("delete user by id");
        }
        return playStoreDao.deletePlayStoreId(id);
    }

    @Override
    public PlayStoreDto getUserById(int id) {
        return playStoreDao.getUserById(id);
    }

    @Override
    public List<PlayStoreDto> getAllDetails(PlayStoreDto playStoreDto) {
        return playStoreDao.getAllDetails(playStoreDto);
    }

    @Override
    public String getversionById(int id) {
        String version = null;
        if(id > 0){
            version= playStoreDao.getversionById(id);
        }
        return version;
    }

    @Override
    public Object[] getdownloadAndVersionById(int id) {
        Object object[] = null;
        if (id>0){
            object = playStoreDao.getdownloadAndVersionById(id);
        }
        return object;
    }

    @Override
    public String getofferedById(int id) {
        String offered = null;
        if(id > 0){
            offered= playStoreDao.getofferedById(id);
        }
        return offered;
    }

    @Override
    public String getreleasedOnById(int id) {
        String released = null;
        if(id > 0){
            released= playStoreDao.getreleasedOnById(id);
        }
        return released;
    }

    @Override
    public Object[] getofferedAndreleasedOnById(int id) {
        Object object[] = null;
        if (id>0){
            object = playStoreDao.getofferedAndreleasedOnById(id);
        }
        return object;
    }
}
