package com.lee.controller;

import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        User user = userMapper.selectById(1);
        System.out.println(user);
        return user;
    }

}
