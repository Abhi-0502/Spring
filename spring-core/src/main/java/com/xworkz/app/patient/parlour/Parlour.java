package com.xworkz.app.patient.parlour;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Parlour {
    public Beauticion beauticion;

    public void getparlour(){
        this.beauticion.getbeauticion();
    }
}
