package com.xworkz.userapp.reposistory;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserDao {

    boolean save(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean updateUserById(UserDto userDto);
    UserDto getById(int id);
    boolean deleteById(int id);
}
