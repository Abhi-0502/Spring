package com.xworkz.newyear.controller;


import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.services.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
@Slf4j
public class SignInController {

    @Autowired
    UserServices services;
//both are sigIn page
//    @PostMapping("signin")
//    public String signIn(@RequestParam("email") String email,
//                         @RequestParam("password") String password,
//                         Model model) {
//        log.info("SignIn invoked for email: {}", email,password);
//
//         return  services.signIn(email, password);
//
//    }

    //    @PostMapping("signin")
//    public String signIn(@RequestParam String email, @RequestParam String password,
//                         Model model) {
//        log.info("SignIn invoked for email: {}", email, password);
//        String valid = services.signIn(email, password);
//        if (valid.equals("dashboard")) {
//            return "dashboard";
//        } else {
//            model.addAttribute("email", email);
//            model.addAttribute("loginError", "Invalid Credentials");
//            return "signIn";
//        }
//
//    }
    @PostMapping("signin")
    public String signIn(@RequestParam String email, @RequestParam String password,
                         Model model) {
        log.info("SignIn invoked for email:{} {}", email, password);
        UserDto valid = services.signIn(email, password
        );
        log.info("After validating and Attempted value is: {} {}" , email , password);

        if (valid.getEmail() != null && valid.getEmail().equalsIgnoreCase(email)) {
            model.addAttribute("dto", valid);
            return "dashboard";
        } else {
            model.addAttribute("email", email);
            // model.addAttribute("loginError", "Invalid Credentials");
            model.addAttribute("valid", "Email or password does't match");
            if (valid.getAttempt() >= 3) {
                model.addAttribute("valid", "Account is blocked");
            }
            return "signIn";
        }

    }

}