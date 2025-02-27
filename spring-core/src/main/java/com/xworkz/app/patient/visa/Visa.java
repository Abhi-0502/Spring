package com.xworkz.app.patient.visa;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Visa {

    public Passport passport;

    public void getvisa(){
        this.passport.getpassport();
    }
}
