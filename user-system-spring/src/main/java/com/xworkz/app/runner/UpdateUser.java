package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateUser {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // Retrieve UserService bean from the application context
        UserService userService = applicationContext.getBean(UserService.class);

        UserDto userDto = new UserDto();
        userDto.setUserName("vinay");
        userDto.setEmail("vinay@gmail.com");
        userDto.setPhNo(1238654);
        userDto.setAge("22");
        userDto.setAddress("Mysore");
        userDto.setAddharNo(987656543229l);

        UserDto userDto1 = new UserDto();
        userDto1.setUserName("Dhanu");
        userDto1.setEmail("danu@gmail.com");
        userDto1.setPhNo(987676543);
        userDto1.setAge("23");
        userDto1.setAddress("kolar");
        userDto1.setAddharNo(985432765432l);

        // Save users
        userService.validateAndSave(userDto);
        userService.validateAndSave(userDto1);
         userService.UpdateUser(userDto1);

    }
}
