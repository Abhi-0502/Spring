package com.xworkz.app.patient.playstation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component

public class PlayStation {

    public Games games;

    public void getgames(){
        this.games.getPlayStation();
    }


}
