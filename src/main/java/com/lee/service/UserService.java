package com.lee.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}
