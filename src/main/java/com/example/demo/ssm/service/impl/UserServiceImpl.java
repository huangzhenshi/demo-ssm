package com.example.demo.ssm.service.impl;

import com.example.demo.ssm.entity.User;
import com.example.demo.ssm.mapper.UserMapper;
import com.example.demo.ssm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo-ssm
 * @create: 2019-06-11 17:17
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Long id){
        User user = userMapper.selectById(1L);
        System.out.println(user);
        return user;
    }

    @Override
    public List<User> listUsers(){
        userMapper.test();
        return userMapper.listUsers();
    }



}
