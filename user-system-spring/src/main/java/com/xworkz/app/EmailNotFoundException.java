package com.xworkz.app;

public class EmailNotFoundException extends RuntimeException{

    public EmailNotFoundException(String emailNotFound){
        super(emailNotFound);
    }
}
