package com.example.demo.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.ssm.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("select * from test_user;")
    List<User> listUsers();

    List<User> test();

}