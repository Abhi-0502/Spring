package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.PlayStoreDto;
import com.xworkz.app.service.PlayStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateId {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);


        PlayStoreDto playStoreDto = new PlayStoreDto(8,"0.7","playstore","19/08/25","900",7);
        PlayStoreDto playStoreDto1 = new PlayStoreDto(9,"1.8","playstore","10/04/25","400",9);

        PlayStoreService playStoreService = applicationContext.getBean(PlayStoreService.class);
        playStoreService.saveAndValidate(playStoreDto);
        playStoreService.saveAndValidate(playStoreDto1);
        playStoreService.UpdatePlayStoreId(10,playStoreDto);

        System.out.println("PlayStore details update successfully");
    }
}
