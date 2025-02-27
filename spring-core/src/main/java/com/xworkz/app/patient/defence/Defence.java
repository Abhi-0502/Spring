package com.xworkz.app.patient.defence;

import com.xworkz.app.patient.bank.Manager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
 //@Component
public class Defence {


    @Value("123456")
    public int defenceId;
    @Value("Ram")
    public String SoliderName;

    //@Autowired
    public Soldiers soldiers;

    public Defence(Soldiers soldiers){
        this.soldiers = soldiers;
    }
    public void getDetails(){
        System.out.println("defence id is :" + defenceId);
        System.out.println("Solider name is :" + SoliderName);
    }
}
