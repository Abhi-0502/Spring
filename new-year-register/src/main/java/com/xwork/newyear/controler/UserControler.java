package com.xwork.newyear.controler;


import com.xwork.newyear.dto.UserDto;
import com.xwork.newyear.service.UserServices;
import jdk.nashorn.internal.runtime.Scope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;


@Slf4j
@Controller
@RequestMapping("/")
public class UserControler {

    @Autowired
    UserServices services;


    @PostMapping("/form")
    public String onSave(UserDto dto, Model model){
        log.info("validate and save method is working{}",dto);
        model.addAttribute("name",dto.getFirstName());
        services.ValidateAndSave(dto);
        return "response.jsp";
    }

@GetMapping("signIn")
public String getPage(){
        return "signIn.jsp";
}



// UpdatePassword
    @PostMapping("resetPassword")
    public String updatePassword(@RequestParam String email,
                                 @RequestParam String password,
                                 @RequestParam String confirmPwd,
                                 Model model) {
            boolean isUpdated = services.UpdatePasswordByEmail(email, password, confirmPwd);
            if (isUpdated) {
                model.addAttribute("message", "Password updated successfully.");
            } else {
                model.addAttribute("message", "Password update failed.");
            }
            return "forgetpassword.jsp";
    }

            }



