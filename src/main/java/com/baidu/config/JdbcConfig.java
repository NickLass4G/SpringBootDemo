package com.baidu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Author:Administrator
 * @Date: 2019/12/5 19:57
 */
@Configuration
public class JdbcConfig {


    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){


        return new DruidDataSource();
    }
}
