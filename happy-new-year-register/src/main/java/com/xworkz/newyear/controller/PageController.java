package com.xworkz.newyear.controller;

import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.services.UserServicesImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j
public class PageController {

    @Autowired
    UserServicesImpl services;


    @GetMapping("resetPassword")
    public String getpage(){
        return "forgetPwd";
    }

    @GetMapping("signIn")
    public String getsignIn(){
        return "signIn";
    }

    @GetMapping("form")
    public String form(){
        return "form";
    }

    @GetMapping("response")
    public String response(){
        return "response";
    }

    @GetMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("update/{email}")
    public String updatePage(@PathVariable String email, Model model){
        UserDto userDto = services.getByEmail(email);
        model.addAttribute("dto",userDto);
        return "update";

    }
}



