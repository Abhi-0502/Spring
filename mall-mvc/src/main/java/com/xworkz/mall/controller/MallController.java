package com.xworkz.mall.controller;

import com.xworkz.mall.dto.MallDto;
import com.xworkz.mall.sercive.MallService;
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

public class MallController {

    @Autowired
    MallService service;

    @PostMapping("user")
    public String onSave(MallDto dto, Model model){
        model.addAttribute("name",dto.getMallName());
        service.save(dto);
        return "response.jsp";
    }
    @RequestMapping("getAllUsers")
    public String getAllUsers(Model model){
        List<MallDto> result = service.getAllUsers();
        model.addAttribute("getAll",result);
        return "getAllDetails.jsp";
    }
    @RequestMapping("getuserbyid")
    public String getById(int id,Model model){
        MallDto byId = service.getById(id);
        model.addAttribute("getById",byId);
        return "searchById.jsp";
    }
    @RequestMapping("fetchUser")
    public String updateById(int id,Model model){
        MallDto updatedValue = service.getById(id);
        model.addAttribute("users",updatedValue);
        return "fetch.jsp";
    }
    @PostMapping("updateUser")
    public String update(MallDto mallDto,Model model){
        boolean update = service.updateUserById(mallDto);
        model.addAttribute("user",update);
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
