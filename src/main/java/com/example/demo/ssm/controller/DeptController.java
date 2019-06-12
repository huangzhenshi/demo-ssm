package com.example.demo.ssm.controller;

import com.example.demo.ssm.entity.Dept;
import com.example.demo.ssm.service.DeptService;
import com.example.demo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    @ResponseBody
    public Integer list() {
        List<Dept> deptList = deptService.listDepts();
        userService.selectById(1L);
        return deptList.size();
    }


    @GetMapping("/testUser")
    @ResponseBody
    public Integer testUser() {
        userService.selectById(1L);
        userService.listUsers();
        return 1;
    }
}
