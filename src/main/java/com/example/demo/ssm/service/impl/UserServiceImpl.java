package com.example.demo.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        testPage();
        return userMapper.listUsers();
    }

    public void testPage() {
        System.out.println("----- baseMapper 自带分页 ------");
        Page<User> page = new Page<>(1, 2);

        IPage<User> userIPage = userMapper.selectPage(page, new QueryWrapper<User>().gt("age", 6));
        System.out.println("总条数 ------> " + userIPage.getTotal());
        System.out.println("当前页数 ------> " + userIPage.getCurrent());
        System.out.println("当前每页显示数 ------> " + userIPage.getSize());

        System.out.println("----- baseMapper 自带分页 ------");
    }


}
