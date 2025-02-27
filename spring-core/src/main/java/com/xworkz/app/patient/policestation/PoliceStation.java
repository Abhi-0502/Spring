package com.xworkz.app.patient.policestation;



import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class PoliceStation {



@Value("Rajajinagar 3rd block")
    public String StationAddress;

   // @Autowired
    public Police police;

    public PoliceStation(Police police){
        this.police=  police;
    }
    public void addStationAddress(){
        System.out.println("station name " + this.StationAddress);

    }
}
