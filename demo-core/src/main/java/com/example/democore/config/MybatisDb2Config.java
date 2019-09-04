package com.example.democore.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author Liyong
 * @Date 2019/9/4 10:23
 **/
@Configuration
@MapperScan(basePackages = "com.example.democore.dao2",sqlSessionTemplateRef = "sqlSessionTemplate2")
public class MybatisDb2Config {

    @Autowired
    @Qualifier("db2")
    private DataSource db2;

    @Bean(name = "sqlSessionFactory2")
    public SqlSessionFactory sqlSessionFactory2() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(db2);
        return factoryBean.getObject();
    }

    @Bean(name = "sqlSessionTemplate2")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception{
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory2());
        return template;
    }


}
