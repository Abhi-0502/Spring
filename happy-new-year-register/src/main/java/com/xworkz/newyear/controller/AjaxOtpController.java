package com.xworkz.newyear.controller;


import com.xworkz.newyear.services.AjaxServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@Slf4j
public class AjaxOtpController {

    @Autowired
    private AjaxServices ajaxServices;

    @GetMapping("checkEmail/{email}")
    public String checkEmailExists(@PathVariable String email){
        log.info("Email is : {}",email);
        return ajaxServices.checkEmail(email);
    }

    @GetMapping("sendOtp/{email}")
    public String sendOtp(@PathVariable String email){
        return ajaxServices.sendOtp(email);
    }
}
