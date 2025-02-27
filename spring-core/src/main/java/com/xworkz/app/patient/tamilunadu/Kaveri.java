package com.xworkz.app.patient.tamilunadu;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Kaveri {

    @Value("Kaveri")
    public String River;
    @Value("Karnataka")
    public String state;

    public Tamilnadu tamilnadu;

    public Kaveri(Tamilnadu tamilnadu){
        this.tamilnadu = tamilnadu;
    }

    public void getkaveri(){
        System.out.println("tamilnadu depending for the water :" + River);
        System.out.println("State is :" + state);
    }
}
