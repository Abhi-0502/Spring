package com.xworkz.messho.messhoapp;

import org.springframework.stereotype.Component;
@Component
public  class MesshoApp {

    public int Id;
    public String Name;
    public String price;

    public void ecommerce() {
        System.out.println("Bying some product");
    }
}