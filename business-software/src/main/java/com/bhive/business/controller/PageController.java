package com.bhive.business.controller;


import com.bhive.business.services.RequirementServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j
public class PageController {

    @Autowired
    RequirementServices services;


    @GetMapping("contact")
    public String getpage(){
        return "contact";
    }

    @GetMapping("response")
    public String response(){
        return "response";
    }

}
