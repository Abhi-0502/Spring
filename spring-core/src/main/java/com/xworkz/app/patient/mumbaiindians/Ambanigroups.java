package com.xworkz.app.patient.mumbaiindians;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Ambanigroups {


    @Value("01")
    public int id;
    @Value("Reliance Group")
    public  String Name;

    public MumbaiIndians mumbaiIndians;

    public Ambanigroups(MumbaiIndians mumbaiIndians){
        this.mumbaiIndians = mumbaiIndians;
    }

    public void getAmbanigroup(){
        System.out.println("id is :" + id);
        System.out.println("ambanigroup name :" + Name);
    }

}
