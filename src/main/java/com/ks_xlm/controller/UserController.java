package com.ks_xlm.controller;

import com.ks_xlm.Common.JWTUtil;
import com.ks_xlm.entity.User;
import com.ks_xlm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import static com.ks_xlm.Common.JWTUtil.generateToken;

import java.util.List;

@RestController
@RequestMapping("/uc")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/uadd")
    public User userAdd(@RequestBody User user){
        userService.userAdd(user);
        return user;
    }

    @RequestMapping("/update")
    public void userUpdate(User user){
        userService.userUpdate(user);
        return;
    }

    @RequestMapping("/select")
    public User userSelect(@RequestParam String username){
        return userService.userSelect(username);
    }

    @RequestMapping("/verify")
    public String userVerify(@RequestBody User user){
        User user1=userService.userSelect(user.getUsername());
        if (user1!=null){
            if (user.getPassword().equals(user1.getPassword())){
                return JWTUtil.generateToken(user.getId()+"","12345");
            }
            else return "1";
        }
        else return "1";
    }
}
