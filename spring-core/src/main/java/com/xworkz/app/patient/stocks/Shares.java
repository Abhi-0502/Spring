package com.xworkz.app.patient.stocks;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Shares {

    @Value("89")
    public int SharesId;
    @Value("Marketing")
    public String type;

//    @Autowired
    public Stocks stocks;

    public Shares(Stocks stocks){
        this.stocks = stocks;
    }

    public void getshares(){
        System.out.println("Shares id :" + SharesId);
        System.out.println("Stocks type :" + type);
    }
}
