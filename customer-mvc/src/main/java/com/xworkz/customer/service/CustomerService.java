package com.xworkz.customer.service;

import com.xworkz.customer.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    boolean validAndSave(CustomerDto customerDto);
    List<CustomerDto> getAllUsers();
    boolean updateUserById(CustomerDto customerDto);
    CustomerDto getById(int id);
    boolean deleteById(int id);
}
