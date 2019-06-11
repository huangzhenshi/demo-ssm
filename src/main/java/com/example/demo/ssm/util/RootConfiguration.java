package com.example.demo.ssm.util;




import java.io.IOException;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;


@Configuration
@MapperScan({"com.example.demo.ssm.mapper"})
public class RootConfiguration extends SpringBootServletInitializer {
    @Autowired
    private SqlSession sqlSession;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        application.registerShutdownHook(false);
        return application.sources(RootConfiguration.class);
    }

    @PostConstruct
    public void postConstruct() throws IOException {
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*.xml");
        new MapperRefresh(resources, sqlSession.getConfiguration()).run();
    }
}