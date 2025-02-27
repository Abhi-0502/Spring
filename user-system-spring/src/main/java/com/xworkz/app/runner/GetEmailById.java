package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class GetEmailById {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserService service = applicationContext.getBean(UserService.class);

        int id = 3;
        String email = service.getEmailById(id);
        System.out.println("for id"+ "the email found is" + email);

        Object[] objects = service.getuserNameAndphNoById(4);
        Arrays.asList(objects).forEach(System.out::println);

        Object[] objects1 = service.fetchUserNameAndAgeByAdhaarNo(987656543229l);
        Arrays.stream(objects1).forEach(System.out::println);

//        Object[] userInfo = service.fetchUserNameAndAgeByAdhaarNo(985432765432l);
//        System.out.println("User Info:");
//        Arrays.stream(userInfo).forEach(System.out::println);

//        String email = service.getEmailByAdharNo(985432765432l);
//        System.out.println(email);

//        boolean addressUpdated = service.updateAddressByAdharNo("kolar",985432765432l);
//        System.out.println("Is Address updated" +addressUpdated);

//        boolean Userdeleted = service.deleteUserByAdharNo(985432765432l);
//        System.out.println("Is User deleted" +Userdeleted);
    }
}
