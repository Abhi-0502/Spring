package com.xworkz.registration.service;

import com.xworkz.registration.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    boolean validateAndSave(UserDto userDto);
    UserDto validateAndSignIn(String email,String password);
    boolean updatePasswordByEmail(String email,String newPassword,String confirmPassword);
    boolean emailExists(String email,String password);
    UserDto findById(int id);
    UserDto updateProfileData(UserDto userDto, UserDto sessionDto, MultipartFile multipartFile);
}
