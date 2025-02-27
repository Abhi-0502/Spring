package com.xworkz.app.patient;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Setter
//@Component
public class Airport {

    @Value("KIA")
    public String airPortName;

   // @Autowired
    public Terminal terminal;

    public Airport(Terminal terminal){
        this.terminal=  terminal;
    }
    public void addAirport(){
        System.out.println("airport name " + this.airPortName);
        terminal.getTerminal();
    }

        }

