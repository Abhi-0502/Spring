package com.xworkz.employee.runner;

import com.xworkz.employee.config.ESpringConfiguration;
import com.xworkz.employee.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ObjectRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ESpringConfiguration.class);

        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        int id = 1;
        String name = employeeService.getEmployeNameById(id);
        System.out.println("for id"+ "the name found is" + name);
        System.out.println("..........................................");

        int id1 = 2;
        String education = employeeService.getEducationbyId(id1);
        System.out.println("for id"+ "the education found is" + education);
        System.out.println("..........................................");


        Object[] objects = employeeService.getEmployeNameAndEducationById(4);
        Arrays.asList(objects).forEach(System.out::println);
        System.out.println("......................................");

        Object[] objects1 = employeeService.getEducationAndNameById(3);
        Arrays.stream(objects1).forEach(System.out::println);
        System.out.println("......................................");

        int id2 = 3;
        String salary = employeeService.getEmployeNameById(id2);
        System.out.println("for id"+ "the salary found is" + salary);
        System.out.println("..........................................");

    }
}
