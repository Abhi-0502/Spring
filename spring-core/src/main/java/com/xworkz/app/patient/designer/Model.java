package com.xworkz.app.patient.designer;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Model {



    public FashionDesigner fashionDesigner;

    public void getdesigner(){
        this.fashionDesigner.getDetails();
    }
}
