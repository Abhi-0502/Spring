package com.xworkz.app.patient.dubai;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Setter
//@Component
public class Burjkhalifa {

    @Value("123456")
    public int id;
    @Value("30")
    public int NoofFloor;

    //@Autowired
    public NoOfFloors noOfFloors;

    public Burjkhalifa(NoOfFloors noOfFloors){
        this.noOfFloors = noOfFloors;
    }
    public void getBurjkhalifa(){
        System.out.println(" id is :" + id);
        System.out.println("No of Floor :" + noOfFloors);
    }
}
