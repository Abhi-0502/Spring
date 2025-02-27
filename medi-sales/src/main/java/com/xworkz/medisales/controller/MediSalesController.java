package com.xworkz.medisales.controller;

import com.xworkz.medisales.dto.MediSalesDto;
import com.xworkz.medisales.services.MediSalesServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/")
@Slf4j
public class MediSalesController {

    @Autowired
    MediSalesServices services;

    @PostMapping("/SignUp")
    public String ValidateSignIn(@Valid MediSalesDto userDto, BindingResult bindingResult, Model model) {
        boolean checkDto = bindingResult.hasErrors();
        log.info("Validation SignIn is invoked");

        if (checkDto) {
            model.addAttribute("dto", userDto);
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            allErrors.forEach(error -> {
                FieldError fieldError = (FieldError) error;
                System.out.println(fieldError.getField() + "  Error  Message  :: " + fieldError.getDefaultMessage());

                // Add specific field validation messages
                if (fieldError.getField().equalsIgnoreCase("userType")) {
                    model.addAttribute("userTypeError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("companyName")) {
                    model.addAttribute("companyNameError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("email")) {
                    model.addAttribute("emailError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("contact")) {
                    model.addAttribute("contactError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("password")) {
                    model.addAttribute("passwordError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("id")) {
                    model.addAttribute("idError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("contactPerson")) {
                    model.addAttribute("contactPersonError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("businessType")) {
                    model.addAttribute("businessTypeError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("mobile")) {
                    model.addAttribute("mobileError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("address1")) {
                    model.addAttribute("address1Error", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("address2")) {
                    model.addAttribute("address2Error", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("pincode")) {
                    model.addAttribute("pincodeError", fieldError.getDefaultMessage());
                } else if (fieldError.getField().equalsIgnoreCase("referral")) {
                    model.addAttribute("referralError", fieldError.getDefaultMessage());
                }
            });
            return "SignUp";
        }

        // If validation is successful
        if (services.validateAndSignIn(userDto)) {
            model.addAttribute("save", "Data is saved");
            log.info("Data will be saved, returning signUp page");
            return "response";
        } else {
            model.addAttribute("dataDto", userDto);
            model.addAttribute("saveError", "Email already exists");
        }
        return "SignUp";
    }

}