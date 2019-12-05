package com.baidu.config;

import com.baidu.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:Administrator
 * @Date: 2019/12/5 21:33
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // 注入拦截器对象
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }

    // 往拦截器链中添加自定义拦截器

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 通过registry添加自定义拦截器,并设置拦截器路径为/*
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
        // 这下面可以配置拦截器链
        
    }
}
