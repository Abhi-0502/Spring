package com.xworkz.app.patient.stocks;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Stocks {

    public Shares shares;

    public void getshare(){
        this.shares.getStocks();
    }
}
