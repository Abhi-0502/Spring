package com.xworkz.app.patient.mobile;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component

public class Mobile {

    @Value("90")
    public int id;
    @Value("Airtel")
    public  String SimcardName;

    public Sim sim;

    public Mobile(Sim sim){
        this.sim = sim;
    }

    public void getmobile(){
        System.out.println("id is :" + id);
        System.out.println("sim card name :" + SimcardName);
    }

}
