package com.xworkz.mall.runner;

import com.xworkz.mall.config.SpringConfiguration;
import com.xworkz.mall.dto.MallDto;
import com.xworkz.mall.service.MallService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MallRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MallDto mallDto = new MallDto();
        MallService mallService = applicationContext.getBean(MallService.class);

        mallDto.setMallName("Mantri Square  Mall");
        mallDto.setMallArea("City  ");
        mallDto.setNoOfFloors(4);
        mallDto.setCity("Bangalore");

        //validate and save the details;
        mallService.validatedAndSave(mallDto);
        System.out.println(mallDto);

        //get by id;
        MallDto mallDto1 = mallService.getUserById(2);
        System.out.println(mallDto1);

        //get all details
        List<MallDto> mallDtos = mallService.getAllDetails(mallDto);
        System.out.println(mallDtos);

        //update operation;
        MallDto newmall = new MallDto();
        newmall.setMallName("GT mall");
        newmall.setMallArea("Magdi main road");
        newmall.setNoOfFloors(4);
        newmall.setCity("Banglore");
        mallService.updateUserById(4,newmall);
        System.out.println("Updated sucessfully...!!");

        //delete operation;
        mallService.DeleteUserById(10);
        System.out.println("Deleted the row...!!");
    }
}
