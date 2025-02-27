package com.xworkz.newyear.controller;

import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.services.UserServicesImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@Slf4j
public class UpdateProfile {

    @Autowired
    UserServicesImpl services;

    @PostMapping("update/update")
    public String updateProfile(@Valid UserDto userDto, BindingResult bindingResult, Model model){
        log.info("update data {}",userDto);
        model.addAttribute("dto",userDto);
        boolean valid = services.updateProfileData(userDto);
        return "update";
    }
}
