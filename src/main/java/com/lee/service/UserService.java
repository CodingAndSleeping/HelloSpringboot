package com.lee.service;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import org.springframework.stereotype.Service;

public interface UserService extends IService<User> {
    public User getUser(int id);
}
