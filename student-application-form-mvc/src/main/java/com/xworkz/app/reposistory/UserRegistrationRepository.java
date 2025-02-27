package com.xworkz.app.reposistory;

import com.xworkz.app.dto.UserDto;


import java.util.List;

public interface UserRegistrationRepository {

    boolean save(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean updateUserById(UserDto userDto);
    UserDto getById(int id);
    boolean deleteById(int id);
}
