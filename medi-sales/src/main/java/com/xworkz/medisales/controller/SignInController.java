package com.xworkz.medisales.controller;

import com.xworkz.medisales.dto.MediSalesDto;
import com.xworkz.medisales.services.MediSalesServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
@Slf4j
public class SignInController {
    @Autowired
    MediSalesServices services;

//    @PostMapping("signIn")
//    public String signIn(@RequestParam String email, @RequestParam String password,
//                         Model model) {
//        log.info("SignIn invoked for email:{} {}", email, password);
//        MediSalesDto valid = services.signIn(email, password);
//        log.info("After validating and Attempted value is: {} {}" , email , password);
//
//        if (valid.getEmail() != null && valid.getEmail().equalsIgnoreCase(email)) {
//            model.addAttribute("dto", valid);
//            return "dashboard";
//        } else {
//            model.addAttribute("email", email);
//            // model.addAttribute("loginError", "Invalid Credentials");
//            model.addAttribute("valid", "Email or password does't match");
//            if (valid.getAttempt() >= 3) {
//                model.addAttribute("valid", "Account is blocked");
//            }
//            return "signIn";
//        }
//
//    }
//


}
