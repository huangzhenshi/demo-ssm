package com.example.demo.ssm.controller;

import com.example.demo.ssm.entity.Dept;
import com.example.demo.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/test")
    @ResponseBody
    public Integer list() {
        List<Dept> deptList = deptService.listDepts();
        return deptList.size();
    }
}
