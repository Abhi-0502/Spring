package com.xworkz.app.patient.policestation;


import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter

//@Component
public class Police {


    @Value("50000")
    public String Salary;

    public PoliceStation policeStation;

//    public Police(PoliceStation policeStation){
//        this.policeStation=  policeStation;
//    }

    public void getPolice(){
        System.out.println("Police salary " +this.Salary);


    }


}
