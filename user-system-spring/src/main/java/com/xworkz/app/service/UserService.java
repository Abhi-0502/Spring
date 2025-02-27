package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;

public interface UserService {


    boolean validateAndSave(UserDto userDto);
    void UpdateUser(UserDto userDto);
    boolean deleteUserById(int id);
    UserDto getUserbyId(int id);
    UserDto getUserName(String userName);
    String getEmailById(int id);
    Object[] getuserNameAndphNoById(int id);
    Object[] fetchUserNameAndAgeByAdhaarNo(long adharNo);
    String getEmailByAdharNo(long adharNo);
    boolean updateAddressByAdharNo(String address ,long adharNo);
    boolean deleteUserByAdharNo(long adhar);
}
