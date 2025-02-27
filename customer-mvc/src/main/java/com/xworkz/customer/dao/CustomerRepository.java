package com.xworkz.customer.dao;

import com.xworkz.customer.dto.CustomerDto;

import java.util.List;

public interface CustomerRepository {
    boolean save(CustomerDto customerDto);
    List<CustomerDto> getAllUsers();
    boolean updateUserById(CustomerDto customerDto);
    CustomerDto getById(int id);
    boolean deleteById(int id);
}
