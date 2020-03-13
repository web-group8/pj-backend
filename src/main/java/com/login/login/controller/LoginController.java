package com.login.login.controller;

import com.login.login.model.User;
import com.login.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dingwl
 * @date 2020/3/8 9:02
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user){
        User user1 = userService.login(user.getUsername(),user.getPassword());
        if(user1!=null){
            return "success";
        }else {
            return "fail";
        }
    }
}
