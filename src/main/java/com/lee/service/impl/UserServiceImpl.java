package com.lee.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import com.lee.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public User getUser(int id) {
        User user = this.selectById(id);
        return user;
    }
}
