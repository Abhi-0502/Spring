package com.xworkz.app.patient.mobile;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Sim {

    public Mobile mobile;

    public void getSim(){
        this.mobile.getmobile();
    }
}
