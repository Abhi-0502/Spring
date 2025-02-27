package com.xworkz.app.controler;

import com.xworkz.app.dto.MovieDto;
import com.xworkz.app.reposistory.MoviesReposistory;
import com.xworkz.app.services.MoviesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class MoviesControler {

    @Autowired
    MoviesServices Services;

    @RequestMapping("user")
    public String onSave(MovieDto movieDto, Model model){

        model.addAttribute("name",movieDto.getMovieName());
        Services.save(movieDto);
        return "response.jsp";
    }

    @GetMapping("getAllUser")
    public String getAllUser(Model model){
        List<MovieDto> user = Services.getAllDetails();
        model.addAttribute("getAllUser",user);
        return "getAllUser.jsp";
    }

    @GetMapping("delete")
    public RedirectView deleteUser(@RequestParam String id, Model model, HttpServletRequest request){
        Services.DeleteUserById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getAllUser");
        return  redirectView;
    }

    @RequestMapping("getMoviesById")
    public String getById(@RequestParam (required = false)Integer id,Model model){
        if (id != null) {
            MovieDto byId = Services.getMovieById(id);
            model.addAttribute("getById", byId);
        }
        return "getMovieById.jsp";

    }

    @RequestMapping("fetchUser")
    public String updateById(@RequestParam (required = false)Integer id , Model model){
        if (id != null) {
            MovieDto UpdatedValue = Services.getMovieById(id);
            model.addAttribute("users", UpdatedValue);
        }
        return "fetchUser.jsp";
    }

    @PostMapping("updateUser")
    public String update(@ModelAttribute MovieDto movieDto, Model model){
        boolean update = Services.updateUserById(movieDto);
        model.addAttribute("updated", update);
        return "fetchUser.jsp";
    }
}
