package com.xworkz.paytm.controler;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.paytm.dto.PaytmDto;
import com.xworkz.paytm.services.PaytmServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class PaytmControler {

    @Autowired
    PaytmServices paytmServices;

    @RequestMapping("user")
    public String onSave(PaytmDto paytmDto, Model model){

        model.addAttribute("name",paytmDto.getFirstName());
        paytmServices.Validateandsave(paytmDto);
        return "response.jsp";
    }

    @GetMapping("getAllUser")
    public String getAllUser(Model model){
        List<PaytmDto> user = paytmServices.getAllUser();
        model.addAttribute("getAllUser",user);
        return "getAllUser.jsp";
    }

    @GetMapping("delete")
    public RedirectView deleteUser(@RequestParam String id, Model model, HttpServletRequest request){
        paytmServices.getdeleteById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getAllUser");
        return  redirectView;
    }

    @RequestMapping("getPaytmById")
    public String getById(@RequestParam (required = false)Integer id,Model model){

            PaytmDto byId = paytmServices.getPaytmById(id);
            model.addAttribute("getById", byId);

        return "getpaytmbyid.jsp";

    }

    @RequestMapping("fetchUser")
    public String updateById(@RequestParam (required = false)Integer id , Model model){

            PaytmDto UpdatedValue = paytmServices.getPaytmById(id);
            model.addAttribute("users", UpdatedValue);

        return "fetchUser.jsp";
    }

    @PostMapping("updateUser")
    public String update(@ModelAttribute PaytmDto paytmDto, Model model){
            boolean update = paytmServices.UpdatePaytmUser(paytmDto);
            model.addAttribute("updated", update);
            return "fetchUser.jsp";
    }
}
