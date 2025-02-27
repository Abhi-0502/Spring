package com.xworkz.newyear.ajaxresources;


import com.xworkz.newyear.services.AjaxServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//@Controller
@RestController
@RequestMapping("api/")
public class AjaxController {

    @Autowired
    private AjaxServices ajaxServices;

    @GetMapping("findByEmail/{email}")
    public  String checkEmailExists(@PathVariable String email){
        log.info("Email is : {} ", email);
        return ajaxServices.checkEmail(email);
    }

    @GetMapping("checkPhone/{contact}")
    public String checkPhone(@PathVariable long contact){
        log.info("phone is :{} ",contact);
        return  ajaxServices.checkPhone(contact);
    }

//    @GetMapping("checkEmail/{email}")
//    public ResponseEntity<String> checkEmailExists(@PathVariable String email){
//        log.info("Email is : {} ", email);
//        return ResponseEntity.ok(ajaxServices.checkEmail(email));
//
//    }
}
