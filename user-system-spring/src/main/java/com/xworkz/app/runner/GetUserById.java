package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import com.xworkz.app.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetUserById {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserDto userDto = new UserDto();
        userDto.setUserName("am");
        userDto.setEmail("am@gmail.com");
        userDto.setPhNo(562789);

        // Retrieve the UserService bean
        UserService service = applicationContext.getBean(UserService.class);
        service.validateAndSave(userDto);
        // Define a valid user ID for fetching
        int userIdToFetch = 10; // Replace with the actual ID of the user you want to fetch

        // Call getUserById with the valid ID
        UserDto user = service.getUserbyId(userIdToFetch);

        // Check if the user was found and print the details
        if (user != null) {
            System.out.println("User found: " + user);
        } else {
            System.out.println("User with ID " + userIdToFetch + " not found.");
        }
    }
    }

