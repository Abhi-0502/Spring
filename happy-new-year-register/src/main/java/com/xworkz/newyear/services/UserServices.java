package com.xworkz.newyear.services;

import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.entity.UserEntity;

public interface UserServices {


    boolean validateAndSignIn(UserDto userDto);
    boolean resetPassword(String email, String newPassword, String confirmPwd);
   // String signIn(String email, String password);
UserDto signIn(String email, String password);

    UserDto getByEmail(String email);
    boolean updateProfileData(UserDto userDto);




}
