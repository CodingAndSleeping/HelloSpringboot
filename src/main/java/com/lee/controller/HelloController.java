package com.lee.controller;

import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam("id") int id) {
        User user =  userService.getUser(id);
        return user;
    }


    // restful风格请求
    @GetMapping("/user1/{id}")
    public User getUser1(@PathVariable int id){
        System.out.println(id);
        User user =  userService.getUser(id);
        return user;
    }

}
