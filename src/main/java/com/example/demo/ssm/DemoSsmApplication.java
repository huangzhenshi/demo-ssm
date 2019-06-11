package com.example.demo.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.ssm.mapper")
public class DemoSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSsmApplication.class, args);
	}

}
