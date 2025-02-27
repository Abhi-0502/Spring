package com.xworkz.registration.service;

public interface MessageOtp {
    boolean sendRegistrationMessage(String subject,String body,String email);
}
