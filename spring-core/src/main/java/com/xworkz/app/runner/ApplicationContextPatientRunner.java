package com.xworkz.app.runner;

import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.patient.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextPatientRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Patient patient = applicationContext.getBean(Patient.class);
     Area area = patient.address.country.state.city.area;
        System.out.println("The state name is"+ area.areaName);
        patient.getPatientDetailsAndAddress();



    }
}
