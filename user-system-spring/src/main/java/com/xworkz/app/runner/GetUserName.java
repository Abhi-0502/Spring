package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetUserName {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        // Retrieve the UserService bean
        UserService service = applicationContext.getBean(UserService.class);

        // Create a new user and save it for testing
        UserDto userDto = new UserDto();
        userDto.setUserName("abhi");
        userDto.setEmail("abhi@gmail.com");
        userDto.setPhNo(789066);
        service.validateAndSave(userDto);

        // Define a username to fetch from the database
        String userNameToFetch = "manu"; // Replace with the actual username you want to fetch

        // Call getUserName with the valid username
        UserDto fetchedUser = service.getUserName(userNameToFetch);

        // Check if the user was found and print the details
        if (fetchedUser != null) {
            System.out.println("User found: " + fetchedUser);
        } else {
            System.out.println("User with username '" + userNameToFetch + " not found.");
        }
    }
}

