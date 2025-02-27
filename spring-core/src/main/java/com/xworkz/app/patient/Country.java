package com.xworkz.app.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Country {

    public String CountryName;
    public State state;

    public  Country(State state){
        this.state=state;

    }

    public void getCountryDetails() {
        System.out.println("The patient country:"+this.CountryName);
        this.state.statedetails();


    }
}
