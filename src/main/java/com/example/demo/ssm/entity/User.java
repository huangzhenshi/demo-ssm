package com.example.demo.ssm.entity;

import lombok.Data;

/**
 * @program: demo-ssm
 * @create: 2019-06-11 17:12
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
