package com.xworkz.car.runner;

import com.xworkz.car.config.CSpringConfiguration;
import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CarRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CSpringConfiguration.class);

        CarDto carDto = new CarDto();
        CarService carService = applicationContext.getBean(CarService.class);

        carDto.setName(" Volkswagen Cars");
        carDto.setModel("Sedan");
        carDto.setPrice(20000.00);
        carService.save(carDto);
        System.out.println("Added successfully...!!");

        CarDto getById = carService.getUserById(1);
        System.out.println(getById);

        List<CarDto> carDtos = carService.getAllDetails(carDto);
        System.out.println(carDtos);

        CarDto updateValue = new CarDto();
        updateValue.setName("Hyundi");
        updateValue.setModel("Elantra");
        updateValue.setPrice(170000.40);
        carService.updateUserById(7,updateValue);
        System.out.println("Updated successfully...!");

        carService.DeleteUserById(3);
        System.out.println("Row deleted");
    }
}
