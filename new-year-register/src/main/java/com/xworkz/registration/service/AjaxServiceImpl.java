package com.xworkz.registration.service;

import com.xworkz.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AjaxServiceImpl implements AjaxService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String checkEmail(String email) {
        boolean exists = userRepository.checkEmail(email);
        if(exists){
            return "Email already exists...!!!";
        }
        return "Email does not exist";
    }

    @Override
    public String checkContact(Long number) {
        boolean exists = userRepository.checkContact(number);
        if(exists){
            return "Phone number exists";
        }return "Number not Exist";
    }
}
