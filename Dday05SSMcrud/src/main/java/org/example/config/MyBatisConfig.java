package org.example.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean getBean(DataSource dataSource){
        SqlSessionFactoryBean  sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setTypeAliasesPackage("org.example.pojo");
        return  sfb;
    }

    @Bean
    public MapperScannerConfigurer getMapper(){
        MapperScannerConfigurer ma =new MapperScannerConfigurer();
        ma.setBasePackage("org.example.dao");
        return  ma;
    }


}
