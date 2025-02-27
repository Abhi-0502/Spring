package com.xworkz.app.patient;


import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component  (This comment is @been working)

public class Terminal {


    @Value("Gate 1")
    public String terminalName;


    public void getTerminal(){
        System.out.println("Name of the terminal" + this.terminalName);

    }
}
