package com.xworkz.app.controler;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserRegistrationController {

    @Autowired
    UserRegistrationService service;


    @RequestMapping("user")
    public String onSave(UserDto dto, Model model){
        model.addAttribute("name",dto.getName());
        service.validateAndSave(dto);
        return "response.jsp";
    }
    @RequestMapping("getAllUsers")
    public String getAllUsers(Model model){
        List<UserDto> result = service.getAllUsers();
        model.addAttribute("getAll",result);
        return "getAllUsers.jsp";
    }
    @RequestMapping("getuserbyid")
    public String getById(int id,Model model){
        UserDto byId = service.getById(id);
        model.addAttribute("getById",byId);
        return "searchById.jsp";
    }
    @RequestMapping("fetchUser")
    public String updateById(int id,Model model){
        UserDto updatedValue = service.getById(id);
        model.addAttribute("users",updatedValue); //user is used as key in fetch.jsp
        System.out.println("fetch by id is ended");
        return "fetch.jsp";
    }
    @PostMapping("updateUser")
    public String update(UserDto userDto,Model model){
        boolean update = service.updateUserById(userDto);
        model.addAttribute("user",update);
        System.out.println("Updated successfully");
        return "fetch.jsp";
    }
    @GetMapping("delete")
    public RedirectView deleteUser(@RequestParam String id, Model model, HttpServletRequest request){
        service.deleteById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getAllUsers");
        return redirectView;
    }
}
