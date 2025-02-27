package com.xworkz.registration.controller;

import com.xworkz.registration.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/")
@Slf4j
@EnableWebMvc
public class ForgotPasswordController {

    @Autowired
    private UserService service;
    //forgot password page
    @PostMapping("resetPassword")
    public String updatePassword(String email, String newPassword, String confirmPassword, Model model){
        boolean isUpdated = service.updatePasswordByEmail(email,newPassword,confirmPassword);
        if(isUpdated) {
            model.addAttribute("message", "Password updated successfully");
            return "forgotPassword";
        }else {
            model.addAttribute("message","Password and confirm password does not matches" +
                    "or provided email does not exist");
            return "forgotPassword";
        }
    }
}
