package com.xworkz.userapp.services;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserService {

    boolean validateAndSave(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean updateUserById(UserDto userDto);
    UserDto getById(int id);
    boolean deleteById(int id);
}
