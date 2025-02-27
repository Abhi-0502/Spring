package com.xworkz.app.patient.youtube;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Channel {

    @Value("5")
    public int id;
    @Value("Zee Kannada")
    public String ChannelName;

    public YouTube youTube;

    public Channel(YouTube youTube){
        this.youTube = youTube;
    }

    public void getchannel(){
        System.out.println("id is :" + id);
        System.out.println("name is :" + ChannelName);
    }
}
