package com.baidu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Author:Administrator
 * @Date: 2019/12/5 19:49
 */
@RestController
public class DemoController {

    @Autowired
    private DataSource dataSource;
    @GetMapping("hello")
    public String hello(){
        System.out.println("datasource:"+dataSource);
        return "hello , spring boot";
    }
}
