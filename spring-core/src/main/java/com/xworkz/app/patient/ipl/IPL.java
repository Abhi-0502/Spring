package com.xworkz.app.patient.ipl;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class IPL {

    public Franchise franchise;

    public void getIPL(){
        this.franchise.getfranchise();
    }
}
