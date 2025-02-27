package com.xworkz.playstoreapp.controler;

import com.xworkz.playstoreapp.dto.PlayStoreDto;
import com.xworkz.playstoreapp.service.PlayStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class PlayStoreControler {

    @Autowired
    PlayStoreService playStoreService;

    @RequestMapping("user")
    public String onSave(PlayStoreDto playStoreDto, Model model){

        model.addAttribute("name",playStoreDto.getUserName());
        playStoreService.addPlayStore(playStoreDto);
        return "response.jsp";
    }

    @RequestMapping("getAllUser")
    public String getAllUser(Model model){
        List<PlayStoreDto> playStore = playStoreService.getAllUser();
        model.addAttribute("listOfUsers",playStore);
        return "getAllUser.jsp";
    }

    @GetMapping("delete")
    public RedirectView deleteUser(@RequestParam String id, Model model, HttpServletRequest request){
        playStoreService.deleteUserById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getAllUser");
        return  redirectView;
    }

    @RequestMapping("getPlayStore")
    public String getById(@RequestParam (required = false)Integer id,Model model){

            PlayStoreDto byId = playStoreService.getProductById(id);
            model.addAttribute("getById", byId);

        return "getPlaystoreById.jsp";

    }

    @RequestMapping("fetchUser")
    public String updateById(@RequestParam (required = false)Integer id , Model model){

            PlayStoreDto UpdatedValue = playStoreService.getProductById(id);
            model.addAttribute("users", UpdatedValue);

        return "fetchUser.jsp";
    }

    @PostMapping("updateUser")
    public String update(@ModelAttribute PlayStoreDto playStoreDto, Model model){
        boolean update = playStoreService.UpdateUser(playStoreDto);
        model.addAttribute("updated", update);
        return "fetchUser.jsp";
    }
}
