package com.xworkz.app.patient.defence;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Soldiers {

    public Defence defence;

    public void getSolider(){
        this.defence.getDetails();
    }
}
