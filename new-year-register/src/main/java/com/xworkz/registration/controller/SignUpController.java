package com.xworkz.registration.controller;

import com.xworkz.registration.dto.UserDto;
import com.xworkz.registration.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@Slf4j
@EnableWebMvc
public class SignUpController {

    @Autowired
    private UserService service;

    @GetMapping("index")
    public String getIndexPage(){
        return "index";
    }

    @PostMapping("/form")
    public String onSave(@Valid UserDto userDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.info("DTO has validation errors");
            bindingResult.getAllErrors().forEach(error -> {
                if (error instanceof FieldError) {
                    FieldError fieldError = (FieldError) error;
                    log.info("{} Error Message :: {}", fieldError.getField(), fieldError.getDefaultMessage());
                    model.addAttribute(fieldError.getField() + "Error", fieldError.getDefaultMessage());
                    if (fieldError.getField().equalsIgnoreCase("firstname")) {
                        model.addAttribute("firstnameerror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("lastName")) {
                        model.addAttribute("lastnameerror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("password")) {
                        model.addAttribute("passworderror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("confirmPassword")) {
                        model.addAttribute("confirmPassworderror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("contact")) {
                        model.addAttribute("contacterror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("dob")) {
                        model.addAttribute("doberror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("place")) {
                        model.addAttribute("placeerror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("state")) {
                        model.addAttribute("stateerror", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("district")) {
                        model.addAttribute("districterror", fieldError.getDefaultMessage());
                    }
                }
            });
            return "signup";
        }
        // Check if email already exists
        if (service.emailExists(userDto.getEmail(),userDto.getPassword())) {
            model.addAttribute("emailError", "User already exists...!!!");
            return "signup";
        }
        // If email does not exist, validate and save
        if (service.validateAndSave(userDto)) {
            model.addAttribute("name", userDto.getFirstName());
            return "response";
        }

        model.addAttribute("saveError", "An unexpected error occurred. Please try again.");
        return "signup";
    }
    //redirect into the signup page without .jsp
    @GetMapping("signup")
    public String getAll(){
        return "signup";
    }

}
