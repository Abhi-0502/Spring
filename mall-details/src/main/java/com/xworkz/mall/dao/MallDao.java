package com.xworkz.mall.dao;

import com.xworkz.mall.dto.MallDto;

import java.util.List;

public interface MallDao {

    boolean save(MallDto mallDto);

    MallDto getUserById(int id);

    List<MallDto> getAllDetails(MallDto mallDto);

    void updateUserById(int id, MallDto newUserData);

    boolean DeleteUserById(int id);

    String getmallNameById(int id);

    String getmallAreaById(int id);

    String getCityById(int id);

    Object[] getmallnameAndCityById(int id);

    Object[] getmallareaAndnoOfFloorById(int id);

}
