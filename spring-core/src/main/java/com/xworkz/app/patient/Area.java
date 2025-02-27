package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Area {



    @Value("Rajajinagar")
    public String areaName;
    @Value("2210 Wilbur Ave")
    public   String streetName;
    @Value("123")
    public int streetNo;

    public  void getAreadetails()
    {
        System.out.println("The area Name:"+areaName);
        System.out.println("The stretName:" + streetName);
        System.out.println("the streetNo:"+ streetNo);
    }
}
