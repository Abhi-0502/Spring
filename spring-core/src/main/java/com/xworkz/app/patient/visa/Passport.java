package com.xworkz.app.patient.visa;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Passport {

    @Value("5")
    public int id;
    @Value("Indian")
    public String Country;

    public Visa visa;

    public Passport(Visa visa){
        this.visa = visa;
    }

    public void getpassport(){
        System.out.println("id is :" + id);
        System.out.println("country is :" + Country);
    }
}
