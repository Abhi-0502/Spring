package com.xworkz.app.patient.tv;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Remote {

    @Value("1234")
    public int id;
    @Value("Sun")
    public String Name;

    public void getRemote(){
        System.out.println("Remote id:"+ id);
        System.out.println("The name"+Name);
    }
}
