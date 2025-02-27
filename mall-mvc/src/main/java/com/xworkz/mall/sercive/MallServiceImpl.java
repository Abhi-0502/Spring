package com.xworkz.mall.sercive;

import com.xworkz.mall.dao.MallRepository;
import com.xworkz.mall.dto.MallDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MallServiceImpl implements MallService{

    @Autowired
    MallRepository dao;

    @Override
    public boolean save(MallDto mallDto) {
        if(mallDto!=null){
            dao.save(mallDto);
        }
        return true;
    }

    @Override
    public List<MallDto> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public boolean updateUserById(MallDto mallDto) {
        return dao.updateUserById(mallDto);
    }

    @Override
    public MallDto getById(int id) {
        return dao.getById(id);
    }

    @Override
    public boolean deleteById(int id) {
        return dao.deleteById(id);
    }
}
