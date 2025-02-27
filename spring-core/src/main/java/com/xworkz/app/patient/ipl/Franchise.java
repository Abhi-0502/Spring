package com.xworkz.app.patient.ipl;

import com.xworkz.app.patient.former.Property;
import org.springframework.beans.factory.annotation.Value;

public class Franchise {

    @Value("45")
    public int id;
    @Value("RCB")
    public String Name;

    public IPL iPl;

    public Franchise(IPL iPl){
        this.iPl = iPl;
    }

    public void getfranchise(){
        System.out.println("id is :" + id);
        System.out.println("ipl name :" + Name);
    }
}
