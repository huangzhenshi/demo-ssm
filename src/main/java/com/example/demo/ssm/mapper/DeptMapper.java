package com.example.demo.ssm.mapper;

import com.example.demo.ssm.entity.Dept;

import java.util.List;

public interface DeptMapper {
    List<Dept> listDepts();
    List<Dept> listDeptsByDeptName();
}
