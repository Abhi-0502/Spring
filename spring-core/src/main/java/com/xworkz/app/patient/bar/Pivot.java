package com.xworkz.app.patient.bar;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Pivot {

    public Bar bar;

    public void getPivot(){
        this.bar.getbar();
    }
}
