package com.bhive.business.controller;

import com.bhive.business.dto.RequirementDto;
import com.bhive.business.services.RequirementServices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/")
@Slf4j
public class RequirementController {


    @Autowired
    RequirementServices services;

    @GetMapping("index")
    public String getIndexPage(){
        return "index";
    }


    @PostMapping("/form")
    public String validateAndContactPage(@Valid RequirementDto userDto, BindingResult bindingResult, Model model) {
        boolean checkdto = bindingResult.hasErrors();
        log.info("Validation ContactPage is invoked");
        if (checkdto ) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            allErrors.forEach(error -> {
                FieldError fieldError = (FieldError) error;
                System.out.println(fieldError.getField() + "  Error  Message  :: " + fieldError.getDefaultMessage());
                if (fieldError.getField().equalsIgnoreCase("name")) {
                    log.info("name message show");
                    model.addAttribute("nameError", fieldError.getDefaultMessage());
                }

                if (fieldError.getField().equalsIgnoreCase("email")) {
                    model.addAttribute("emailError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("phoneNo")) {
                    model.addAttribute("phoneNoError", fieldError.getDefaultMessage());
                }

                if (fieldError.getField().equalsIgnoreCase("companyName")) {
                    model.addAttribute("companyNameError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("message")) {
                    model.addAttribute("messageError", fieldError.getDefaultMessage());
                }
            });
            return "contact";
        }
        if (services.validateAndContactPage(userDto)) {
            model.addAttribute("save", "Data is saved");
            log.info("data will be saved return contact page");
            return "response";
        } else {
            model.addAttribute("dateDto", userDto);
            model.addAttribute("saveError", "Email already exists");
        }
        return "contact";
    }



}