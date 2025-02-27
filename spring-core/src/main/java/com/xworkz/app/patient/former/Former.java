package com.xworkz.app.patient.former;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Former {

    @Value("5")
    public int id;
    @Value("1000000")
    public String Propertyamount;

    public Property property;

    public Former(Property property){
        this.property = property;
    }

    public void getproperty(){
        System.out.println("id is :" + id);
        System.out.println("Property amount :" + Propertyamount);
    }

}
