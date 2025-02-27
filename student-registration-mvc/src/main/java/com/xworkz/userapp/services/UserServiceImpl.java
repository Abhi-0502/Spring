package com.xworkz.userapp.services;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.reposistory.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    UserDaoImpl userRegistrationRepository;

    @Override
    public boolean validateAndSave(UserDto userDto) {
        if(userDto != null){
            if (userDto.getName() != null && !userDto.getName().isEmpty())
                userRegistrationRepository.save(userDto);
        }
        return true;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRegistrationRepository.getAllUsers();
    }

    @Override
    public boolean updateUserById(UserDto userDto) {
        return userRegistrationRepository.updateUserById(userDto);

    }

    @Override
    public UserDto getById(int id) {
        return userRegistrationRepository.getById(id);
    }

    @Override
    public boolean deleteById(int id) {
        return userRegistrationRepository.deleteById(id);
    }
}
