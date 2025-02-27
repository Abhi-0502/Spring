package com.xworkz.mall.sercive;

import com.xworkz.mall.dto.MallDto;

import java.util.List;

public interface MallService {
    boolean save(MallDto mallDto);
    List<MallDto> getAllUsers();
    boolean updateUserById(MallDto mallDto);
    MallDto getById(int id);
    boolean deleteById(int id);
}
