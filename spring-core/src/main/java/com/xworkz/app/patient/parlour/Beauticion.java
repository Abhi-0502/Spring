package com.xworkz.app.patient.parlour;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Beauticion {

    @Value("08")
    public int id;
    @Value("kazal")
    public  String productName;

    public Parlour parlour;

    public Beauticion(Parlour parlour){
        this.parlour = parlour;
    }

    public void getbeauticion(){
        System.out.println("id is :" + id);
        System.out.println("product name :" + productName);
    }
}
