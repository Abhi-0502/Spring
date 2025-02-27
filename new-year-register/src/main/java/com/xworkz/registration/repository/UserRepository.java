package com.xworkz.registration.repository;

import com.xworkz.registration.dto.UserDto;
import com.xworkz.registration.entity.UserEntity;


public interface UserRepository {
    boolean save(UserEntity entity);
    UserEntity findByEmailAndPassword(String email,String password);
    boolean updatePassword(String email, String newPassword, String confirmPassword);
    UserEntity findById(int id);
    UserEntity updateProfileData(UserEntity userEntity);
    boolean checkEmail(String email);
    boolean checkContact(Long number);
}
