package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.PlayStoreDto;
import com.xworkz.app.service.PlayStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class PlayStoreRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        PlayStoreDto playStoreDto = new PlayStoreDto(5,"9.7","playstore","22/08/24","200",9);
        PlayStoreDto playStoreDto1 = new PlayStoreDto(6,"3.8","playstore","10/04/25","500",8);

        PlayStoreDto playStoreDto2 = new PlayStoreDto(7,"7.8","playstore","11/08/23","300",7);

        PlayStoreDto playStoreDto3 = new PlayStoreDto(8,"5.5","playstore","20/08/22","800",6);


        PlayStoreService playStoreService = applicationContext.getBean(PlayStoreService.class);
        playStoreService.saveAndValidate(playStoreDto);
        playStoreService.saveAndValidate(playStoreDto1);
        playStoreService.saveAndValidate(playStoreDto2);
        playStoreService.saveAndValidate(playStoreDto3);

        //get by id
        PlayStoreDto playStoreDto4 = playStoreService.getUserById(5);
        System.out.println(playStoreDto4);

        //get all details
        List<PlayStoreDto> Dtos = playStoreService.getAllDetails(playStoreDto);
        System.out.println(Dtos);

        //delete by Id
        int playstoreIdToDelete = 8; // Replace with the actual ID of the user you want to delete

        boolean isDeleted = playStoreService.deletePlayStoreId(playstoreIdToDelete);

        System.out.println("User with ID " + playstoreIdToDelete + " deleted successfully.");

        System.out.println("User with ID " + playstoreIdToDelete + " not found.");



    }
}
