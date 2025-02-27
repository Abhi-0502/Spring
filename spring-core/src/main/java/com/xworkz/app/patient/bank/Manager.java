package com.xworkz.app.patient.bank;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Manager {

 public Bank bank;

 public void getBank(){
     this.bank.getBankDetails();
 }
}
