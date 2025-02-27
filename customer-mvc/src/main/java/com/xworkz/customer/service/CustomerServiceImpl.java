package com.xworkz.customer.service;

import com.xworkz.customer.dao.CustomerRepository;
import com.xworkz.customer.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository dao;

    @Override
    public boolean validAndSave(CustomerDto customerDto) {
           return dao.save(customerDto);
    }

    @Override
    public List<CustomerDto> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public boolean updateUserById(CustomerDto customerDto) {
        return dao.updateUserById(customerDto);
    }

    @Override
    public CustomerDto getById(int id) {
        return dao.getById(id);
    }

    @Override
    public boolean deleteById(int id) {
        return dao.deleteById(id);
    }
}
