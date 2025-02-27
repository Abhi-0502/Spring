package com.xworkz.app.patient.youtube;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class YouTube {

    public Channel channel;

    public void getyoutube(){
        this.channel.getchannel();
    }
}
