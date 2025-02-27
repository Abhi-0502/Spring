package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        // Retrieve UserService bean from the application context
        UserService userService = applicationContext.getBean(UserService.class);


        // Define a valid user ID for deletion
        int userIdToDelete = 5; // Replace with the actual ID of the user you want to delete

        // Call deleteUserById with the valid ID
        boolean isDeleted = userService.deleteUserById(userIdToDelete);

        // Log the result of the deletion

            System.out.println("User with ID " + userIdToDelete + " deleted successfully.");

            System.out.println("User with ID " + userIdToDelete + " not found.");
        }
    }



