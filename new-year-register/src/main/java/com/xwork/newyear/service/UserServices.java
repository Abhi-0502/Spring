package com.xwork.newyear.service;

import com.xwork.newyear.dto.UserDto;

public interface UserServices {

    boolean ValidateAndSave(UserDto userDto);
    String validateAndSignIn(UserDto userDto);

    boolean UpdatePasswordByEmail(String email,String password,String confirmPwd);


}
