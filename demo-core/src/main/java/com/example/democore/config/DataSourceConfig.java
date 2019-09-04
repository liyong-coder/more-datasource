package com.example.democore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author Liyong
 * @Date 2019/9/4 10:20
 **/
@Configuration
public class DataSourceConfig {

    @Bean(name = "db1")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }
}
