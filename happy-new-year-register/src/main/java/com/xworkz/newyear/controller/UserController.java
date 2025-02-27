package com.xworkz.newyear.controller;

import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.services.UserServices;
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
public class UserController {


    @Autowired
    UserServices services;


    @PostMapping("/form")
    public String ValidateSignIn(@Valid UserDto userDto, BindingResult bindingResult, Model model) {
        boolean checkdto = bindingResult.hasErrors();
        log.info("Validation SignIn is invoked");
        if (checkdto ) {
            model.addAttribute("dto",userDto);
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            allErrors.forEach(error -> {
                FieldError fieldError = (FieldError) error;
                System.out.println(fieldError.getField() + "  Error  Message  :: " + fieldError.getDefaultMessage());
                if (fieldError.getField().equalsIgnoreCase("fullName")) {
                    log.info("fullName message show");
                    model.addAttribute("fullNameError", fieldError.getDefaultMessage());
                }
                log.info("FullNameError Message show" );
                if (fieldError.getField().equalsIgnoreCase("LastName")) {
                    model.addAttribute("lastNameError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("email")) {
                    model.addAttribute("emailError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("alterEmail")) {
                    model.addAttribute("alterEmailError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("contact")) {
                    model.addAttribute("contactError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("alternativeContact")) {
                    model.addAttribute("alternativeContactError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("dob")) {
                    model.addAttribute("dobError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("place")) {
                    model.addAttribute("placeError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("state")) {
                    model.addAttribute("stateError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("District")) {
                    model.addAttribute("DistrictError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("password")) {
                    model.addAttribute("passwordError", fieldError.getDefaultMessage());
                }
                if (fieldError.getField().equalsIgnoreCase("confirmPwd")) {
                    model.addAttribute("confirmPwdError", fieldError.getDefaultMessage());
                }
            });
                return "form";
        }
        if (services.validateAndSignIn(userDto)) {
            model.addAttribute("save", "Data is saved");
            log.info("data will be saved return signUp page");
            return "response";
        } else {
            model.addAttribute("dateDto", userDto);
            model.addAttribute("saveError", "Email already exists");
        }
        return "form";
    }


    @PostMapping("resetPassword")
    public String resetPassword(@RequestParam("email") String email,
                                @RequestParam("newPassword") String newPassword,
                                @RequestParam("confirmPassword") String confirmPassword,
                                Model model) {
        log.info("Reset Password invoked for email: {}", email);
        if (services.resetPassword(email, newPassword, confirmPassword)) {
            model.addAttribute("successMessage", "Password updated successfully");
            return "forgetPwd";
        } else {
            model.addAttribute("errorMessage", "Failed to update password. Please check your inputs.");
            return "forgetPwd";
        }
    }




}