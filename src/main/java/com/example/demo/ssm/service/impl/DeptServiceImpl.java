package com.example.demo.ssm.service.impl;

import com.example.demo.ssm.entity.Dept;
import com.example.demo.ssm.mapper.DeptMapper;
import com.example.demo.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptDao;

    public List<Dept> listDepts(){
        return deptDao.listDepts();
    }
}
