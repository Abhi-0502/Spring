package com.xworkz.newyear.services;

public interface AjaxServices {

    String checkEmail(String email);
    String checkPhone(Long contact);
    String sendOtp(String email);


}
