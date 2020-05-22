package com.login.login.controller;

import com.login.login.model.User;
import com.login.login.model.Result;
import com.login.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author dingwl
 * @date 2020/3/8 9:02
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/")
//    public String guide(){
//
//        return "/dist/index";
//
//    }

//    @RequestMapping("/loginpage")
//    public String index(){
//        return "login";
//    }
//
//    @RequestMapping("/registpage")
//    public String index2(){
//        return "regist";
//    }

    @RequestMapping("/test2")
    public User index3(){
        User user=new User();
        user.setId(1);
        user.setUsername("刘醒");
        user.setPassword("梁非凡");
        return user;
    }

    @RequestMapping("/test")
    public User index4(@RequestBody User user){
        User user1=new User();
        user1.setId(user.getId()+1);
        user1.setUsername(user.getUsername()+"abc");
        user1.setPassword(user.getPassword()+"def");
        return user1;
    }

    @RequestMapping("/login")
    public Result login(@RequestBody User user){
        User user1 = userService.login(user);
        Result res=new Result();
        if(user1!=null){
            res.setMsg("成功");
            res.setSuccess(true);
        }else {
            res.setMsg("失败");
            res.setSuccess(false);
        }
        return res;
    }

    @RequestMapping("/regist")
    public Result regist(@RequestBody User user){
        Result res=new Result();
        try{
            userService.regist(user);
            res.setMsg("成功");
            res.setSuccess(true);
        }
        catch(Exception ex){
            res.setMsg("失败");
            res.setSuccess(false);
        }

        return res;
    }

}
