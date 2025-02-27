package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.CustomerDto;
import com.xworkz.app.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CustomerRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerDto customerDto = new CustomerDto();
        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        customerDto.setCustomerName("thanvi");
        customerDto.setEmail("thanvi@gmail.com");
        customerDto.setCustomerNo(876543);
//
//        //validate and save details
//        customerService.save(customerDto);
//       System.out.println(customerDto);

//        //get by id;
//        CustomerDto customerDto1 = customerService.getUserById(3);
//        System.out.println(customerDto1);

//        //get all details
        List<CustomerDto> Dtos = customerService.getAllDetails(customerDto);
        System.out.println(Dtos);

//        //update operation;
        CustomerDto dto = new CustomerDto();
        dto.setCustomerName("baba");
        dto.setEmail("baba@gmail.com");
        dto.setCustomerNo(4876543);

        customerService.updateUserById(14,dto);
        System.out.println("Updated sucessfully...!!");

//        //delete operation;
//        customerService.DeleteUserById(9);
//        System.out.println("Deleted the row...!!");
    }
}
