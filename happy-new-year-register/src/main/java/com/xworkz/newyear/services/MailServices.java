package com.xworkz.newyear.services;

public interface MailServices {

    boolean sendRegistrationMessage(String subject, String body , String email);
}
