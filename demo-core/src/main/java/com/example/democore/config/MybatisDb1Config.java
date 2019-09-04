package com.example.democore.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author Liyong
 * @Date 2019/9/4 10:23
 **/
@Configuration
@MapperScan(basePackages = "com.example.democore.dao1",sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MybatisDb1Config {

    @Autowired
    @Qualifier("db1")
    private DataSource db1;

    @Bean(name = "sqlSessionFactory1")
    @Primary
    public SqlSessionFactory sqlSessionFactory1() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(db1);
        return factoryBean.getObject();
    }

    @Bean(name = "sqlSessionTemplate1")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate() throws Exception{
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1());
        return template;
    }


}
