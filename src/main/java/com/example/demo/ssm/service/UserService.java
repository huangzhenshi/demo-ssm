package com.example.demo.ssm.service;

import com.example.demo.ssm.entity.User;

import java.util.List;

public interface UserService {
    User selectById(Long id);
    List<User> listUsers();
}
