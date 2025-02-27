package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;

import java.util.List;

public interface UserRegistrationService {

    boolean validateAndSave(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean updateUserById(UserDto userDto);
    UserDto getById(int id);
    boolean deleteById(int id);
}
