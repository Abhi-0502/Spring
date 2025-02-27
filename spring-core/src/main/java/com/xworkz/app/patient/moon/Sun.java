package com.xworkz.app.patient.moon;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Sun {

    public Moon moon;

    public void getsun(){
        this.moon.getmoon();
    }
}
