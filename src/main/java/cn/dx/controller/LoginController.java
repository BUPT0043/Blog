package cn.dx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.dx.model.User;
import cn.dx.service.UserService;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("UserService")
    private UserService userService;

    @RequestMapping(value = "/index", method = {
        RequestMethod.GET
    })
    private String index(HttpServletRequest request, Model model) {
        request.getSession().removeAttribute("UuserModel");
        return "/login";
    }

    @RequestMapping(value = "/login", method = {
        RequestMethod.GET
    })
    private String loginout(HttpServletRequest request, Model model) {
        request.getSession().removeAttribute("UuserModel");
        return "/login";
    }

    @RequestMapping(value = "/login", method = {
        RequestMethod.POST
    })
    private String login(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<User> list = this.userService.getUserByUserName(username);
        if (list.size() > 0) {
            User user = list.get(0);
            // if(password.equals(user.getPassword())){
            // request.getSession().setAttribute("UuserModel", user);
            // return "/index";
            // }else{
            // model.addAttribute("error", "error");
            // return "login";
            // }
            // }else{
            // model.addAttribute("error", "error");
            //
            // }
            // return "login";
        }
        return "login";
    }
}
