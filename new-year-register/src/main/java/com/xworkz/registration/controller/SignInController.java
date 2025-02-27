package com.xworkz.registration.controller;

import com.xworkz.registration.constant.ServiceConstant;
import com.xworkz.registration.dto.UserDto;
import com.xworkz.registration.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/")
@Slf4j
@EnableWebMvc
public class SignInController {

    @Autowired
    private UserService service;

    @GetMapping("/signin")
    public String getSignIn() {
        return "signin";
    }

    @PostMapping("/signin")
    public String onSignIn(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        log.info("SignIn invoked for email: {}, password: {}", email, password);
        UserDto valid = service.validateAndSignIn(email, password);
        if (valid != null && valid.getFirstName() != null) {
            model.addAttribute("image",valid);
            model.addAttribute("id", valid.getId());
            model.addAttribute("dto",valid.getFirstName());
            return "dashboard";
        } else {
            model.addAttribute("loginError", "Invalid Credentials");
            return "signin";
        }
    }
   /* @GetMapping("view/{imageName}")
    public void getImage(@PathVariable String imageName, HttpServletResponse response) throws IOException {
        Path path = Paths.get(ServiceConstant.FILE_PATH.getPath()+imageName);
        log.info("{} ",path);
        Files.copy(path,response.getOutputStream());
        response.getOutputStream().flush();
    }*/
}
