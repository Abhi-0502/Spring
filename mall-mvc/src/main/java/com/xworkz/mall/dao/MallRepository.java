package com.xworkz.mall.dao;

import com.xworkz.mall.dto.MallDto;

import java.util.List;

public interface MallRepository {
    boolean save(MallDto mallDto);
    List<MallDto> getAllUsers();
    boolean updateUserById(MallDto mallDto);
    MallDto getById(int id);
    boolean deleteById(int id);
}
