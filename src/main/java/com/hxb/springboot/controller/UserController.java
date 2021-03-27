package com.hxb.springboot.controller;

import com.hxb.springboot.pojo.EASYBUY_USER;
import com.hxb.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String index(){
        return "redirect:/login.html";
    }

    @RequestMapping("/login")
//    @ResponseBody
    public String login(String uname, String upass,HttpServletRequest request){
        System.out.println(uname+","+upass);
        EASYBUY_USER user = userService.login(uname, upass);

        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("loginUser",user);
            return "redirect:/to_main.html";
        }
        return "redirect:/error.html";
    }

    @RequestMapping("/toMainth")
    public String toMatinTh(){
        return "main_th";
    }


}
