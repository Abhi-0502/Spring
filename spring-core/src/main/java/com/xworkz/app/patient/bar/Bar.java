package com.xworkz.app.patient.bar;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Bar {

    @Value("7")
    public int id;
    @Value("King")
    public String Name;

    public Pivot pivot;

    public Bar(Pivot pivot){
        this.pivot = pivot;
    }

    public void getbar(){
        System.out.println("id is :" + id);
        System.out.println("brand name is :" + Name);
    }

}
