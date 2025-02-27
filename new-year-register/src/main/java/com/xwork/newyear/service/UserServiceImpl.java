package com.xwork.newyear.service;

import com.xwork.newyear.dto.UserDto;
import com.xwork.newyear.entity.UserEntity;
import com.xwork.newyear.reposistoery.UserReposistoeryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@Service
public class UserServiceImpl implements UserServices {

    // private LocalDate localDate = LocalDate.now();

    @Autowired
    private UserReposistoeryImpl reposistoery;


    @Override
    public boolean ValidateAndSave(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        if (userDto != null) {
            BeanUtils.copyProperties(userDto, userEntity);
            userEntity.setCreatedBy(userDto.getFirstName());
            userEntity.setCreateDate(LocalDate.now());
            System.out.println("Saving user details: " + userEntity.toString());
            reposistoery.Save(userEntity);
        }
        return true;
    }

   @Override
  public String validateAndSignIn(UserDto userDto) {

        UserEntity userEntity = reposistoery.findByEmail(userDto.getEmail());
        if (userEntity != null) {
            // The email exists, proceed with checking the password
            if (userEntity.getPassword().equals(userDto.getPassword())) {
                return "Email exists. Welcome back!";
            } else {
                return "Invalid password!";
            }
        } else {
            return "Email does not exist!";
        }
    }


    @Override
    public boolean UpdatePasswordByEmail(String email, String password, String confirmPwd) {
        reposistoery.updatePassword(email, password, confirmPwd);
        System.out.println("Email: " + email);
        System.out.println("New Password: " + password);
        System.out.println("Confirm Password: " + confirmPwd);
        return true;
    }

}
