package com.xworkz.registration.ajaxresource;

import com.xworkz.registration.service.AjaxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class AjaxController {

    @Autowired
    private AjaxService ajaxService;

    @GetMapping("checkEmail/{email}")
    public String checkEmailExists(@PathVariable String email){
        log.info("Email is: {}",email);
        return ajaxService.checkEmail(email);
    }
    @GetMapping("checkNumber/{contact}")
    public String checkPhoneNumber(@PathVariable Long contact){
        log.info("Phone number is: {} ",contact);
        return ajaxService.checkContact(contact);
    }
}
