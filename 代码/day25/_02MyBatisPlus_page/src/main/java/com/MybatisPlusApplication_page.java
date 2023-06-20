package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dao")  //扫描dao,Mybatis动态代理生成实现类---->Mybatis把实现类加入到我们的容器中
public class MybatisPlusApplication_page {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication_page.class,args);
    }
}
