package com.xworkz.app.patient.bank;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Setter
//@Component

public class Bank {


    @Value("123456")
    public int BankId;
    @Value("IOB")
    public String BankName;

    //@Autowired
    public Manager manager;

    public Bank(Manager manager){
        this.manager = manager;
    }
    public void getBankDetails(){
        System.out.println("Bank id is :" + BankId);
        System.out.println("Bank name is :" + BankName);
    }
}
