package com.xworkz.registration.controller;

import com.xworkz.registration.constant.ServiceConstant;
import com.xworkz.registration.dto.UserDto;
import com.xworkz.registration.entity.UserEntity;
import com.xworkz.registration.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/")
@Slf4j
@EnableWebMvc
public class fetchPageController {

    @Autowired
    private UserService service;

    @GetMapping("fetchbymail")
    public String updateAll() {
        return "fetchbymail";
    }
    @GetMapping("updateProfile")
    public String fetchPage(@RequestParam("id") Integer id, HttpSession httpSession,Model model) {
        UserDto userDto = (UserDto) service.findById(id);
        //setting the values using httpsession;
        httpSession.setAttribute("newYear",userDto);
        model.addAttribute("dto", userDto);
        log.info("Controller entity of fetching data by id: {} " + userDto);
        return "fetchbymail";
    }

    @PostMapping("fetchById")
    public String updateProfile(@RequestParam("file") MultipartFile multipartFile,UserDto userDto, Model model, HttpServletRequest request
    ) {
        log.info("File name: {}",multipartFile.getOriginalFilename());
        log.info("updated data {} ", userDto);
        UserDto sessionDto = (UserDto) request.getSession().getAttribute("newYear");
        log.info("updated data by using session: {}",sessionDto);
       UserDto valid = service.updateProfileData(userDto,sessionDto,multipartFile);
            model.addAttribute("dto",valid);
            model.addAttribute("message", "Updated successfully...!!!");

        return "fetchbymail";
    }
    @GetMapping("view/{imageName}")
    public void getImage(@PathVariable String imageName, HttpServletResponse response) throws IOException {
        Path path = Paths.get(ServiceConstant.FILE_PATH.getPath()+imageName);
        log.info("{} ",path);
        Files.copy(path,response.getOutputStream());
        response.getOutputStream().flush();
    }
}
