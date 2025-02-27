package com.xworkz.app.patient.mumbaiindians;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class MumbaiIndians {

    public Ambanigroups ambanigroups;

    public void getindians(){
        this.ambanigroups.getMumbaiIndians();
    }
}
