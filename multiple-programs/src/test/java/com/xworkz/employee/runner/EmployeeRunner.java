package com.xworkz.employee.runner;

import com.xworkz.employee.config.ESpringConfiguration;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ESpringConfiguration.class);

        EmployeeDto employeeDto = new EmployeeDto();
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        //valid and save
        employeeDto.setName("Bob Smith");
        employeeDto.setEducation("Master");
        employeeDto.setSalary(65000);
        employeeService.validandSave(employeeDto);
        System.out.println("Added successfully");

//        //get by id
//        EmployeeDto getbyId = employeeService.getUserById(1);
//        System.out.println(getbyId);

        //get all the details;
//        List<EmployeeDto> employeeDtos = employeeService.getAllDetails(employeeDto);
//        System.out.println(employeeDtos);

//        //update the details by id;
//        EmployeeDto updateValue = new EmployeeDto();
//        updateValue.setName("Mary");
//        updateValue.setEducation("BCA");
//        updateValue.setSalary(25000.0);
//        employeeService.updateUserById(7,updateValue);
//        System.out.println("Updated successfully...!!");
//
//        //delete operation;
//        employeeService.DeleteUserById(5);
//        System.out.println("Row deleted");
    }
}
