package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserRegistrationRepository {

    boolean save(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean updateUserById(UserDto userDto);
    UserDto getById(int id);
    boolean deleteById(int id);
}
