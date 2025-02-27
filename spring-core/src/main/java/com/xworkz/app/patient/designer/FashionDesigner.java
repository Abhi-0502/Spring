package com.xworkz.app.patient.designer;

import com.xworkz.app.patient.defence.Soldiers;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Setter
//@Component
public class FashionDesigner {

    @Value("15000")
    public int price;
    @Value("Ram")
    public String DesignerName;

    //@Autowired
    public Model model;

    public FashionDesigner(Model model){
        this.model = model;
    }
    public void getDetails(){
        System.out.println("designer price is :" + price);
        System.out.println("designer name is :" +DesignerName );
    }
}
