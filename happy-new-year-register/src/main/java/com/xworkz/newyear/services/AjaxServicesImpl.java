package com.xworkz.newyear.services;

import com.xworkz.newyear.entity.UserEntity;
import com.xworkz.newyear.reposisteory.UserReposisteory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class AjaxServicesImpl implements AjaxServices {


    @Autowired
    private UserReposisteory userReposisteory;

    @Autowired
    private MailServices mailServices;

    @Override
    public String checkEmail(String email) {
        boolean exists = userReposisteory.findByEmail(email);
        System.out.println(exists);
        if (exists) {
            return "email exists";
        }
        return "email does not exists";
    }

    @Override
    public String checkPhone(Long contact) {
        boolean exists = userReposisteory.checkPhone(contact);
        System.out.println(exists);
        if (exists) {
            return "phoneNumber exists";
        }
        return "phoneNumber Does not exists";
    }

    @Override
    public String sendOtp(String email) {
        UserEntity userEntity = userReposisteory.checkEmail(email);
        System.err.println(userEntity);
        if (userEntity != null && userEntity.getEmail() != null) {
            Random random = new Random();
            Integer otp = random.nextInt(999999);
            log.info("your Otp is :: {} ", otp);
            mailServices.sendRegistrationMessage("OTP Verification", " your otp is :: " + otp, email);
            userEntity.setOtp(otp.toString());
            userReposisteory.updateDate(userEntity);
            return "otp sent";
        } else {
            log.info("User Not found {}",email);
            return "User Not Found";
        }
    }




}
