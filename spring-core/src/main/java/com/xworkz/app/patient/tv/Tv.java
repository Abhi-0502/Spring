package com.xworkz.app.patient.tv;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Tv {


  //  @Autowired
    @Value("Sun")
    public String TvName;
    public int id;

    public Remote remote;


    public Tv(Remote remote){
        this.remote = remote;
    }

    public void tvdetails(){
       this.remote.getRemote();
    }

}
