package com.xworkz.app.patient.playstation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Games {

    @Value("299")
    public int id;
    @Value("Blaze")
    public  String Name;

    public PlayStation playStation;

    public Games(PlayStation playStation){
        this.playStation = playStation;
    }

    public void getplays(){
        System.out.println("id is :" + id);
        System.out.println("game name :" + Name);
    }
}
