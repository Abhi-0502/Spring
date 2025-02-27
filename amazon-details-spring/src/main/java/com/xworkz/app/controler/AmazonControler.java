package com.xworkz.app.controler;

import com.xworkz.app.dto.AmazonDto;
import com.xworkz.app.service.AmazonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/")
public class AmazonControler {


    @Autowired
    AmazonService services;

    @RequestMapping("user")
    public String onSave(AmazonDto amazonDto, Model model){
        model.addAttribute("name",amazonDto.getProductName());
        services.save(amazonDto);
        return "response.jsp";
    }

    @RequestMapping("getAllUser")
    public String getAllUser(Model model){
        List<AmazonDto> user = services.getAllDetails();
        model.addAttribute("getAllUser",user);
        return "getAllUser.jsp";
    }

    @RequestMapping("delete")
    public RedirectView deleteUser(@RequestParam String id, Model model, HttpServletRequest request){
        services.deleteProductId(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getAllUser");
        return  redirectView;
    }

    @RequestMapping("getProductById")
    public String getById(@RequestParam (required = false)Integer id,Model model){
        if (id != null) {
            AmazonDto byId = services.getProductById(id);
            model.addAttribute("getById", byId);
        }
        return "getProductById.jsp";

    }

    @RequestMapping("fetchUser")
    public String updateById(int id,Model model){
        AmazonDto updatedValue = services.getProductById(id);
        model.addAttribute("users",updatedValue); //user is used as key in fetch.jsp
        System.out.println("fetch by id is ended");
        return "fetchUser.jsp";
    }
    @PostMapping("updateUser")
    public String update(AmazonDto amazonDto,Model model){
        boolean update = services.UpdateProductId(amazonDto);
        model.addAttribute("user",update);
        System.out.println("Updated successfully");
        return "fetchUser.jsp";
    }
}
