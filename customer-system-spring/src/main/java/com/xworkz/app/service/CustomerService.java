package com.xworkz.app.service;

import com.xworkz.app.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    boolean save(CustomerDto customerDto);

    CustomerDto getUserById(int id);

    List<CustomerDto> getAllDetails(CustomerDto customerDto);

    void updateUserById(int id, CustomerDto newUserData);

    boolean DeleteUserById(int id);

    String getcustomerNameById(int id);

    String getemailById(int id);

    Integer getcustomerNoById(int id);

    Object[] getCustomerNameAndemailById(int id);

    Object[] getcustomerNoAndnameById(int id);
}
