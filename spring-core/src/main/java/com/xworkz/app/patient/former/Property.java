package com.xworkz.app.patient.former;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Property {

    public Former former;

    public void getformer(){
        this.former.getproperty();
    }
}
