package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


public class JDBCConfig {

    @Value("${jdbc.name}")
    private  String  name;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private  String  url;
    @Value("${jdbc.driver}")
    private  String  driver;

    public DataSource getDataSource(){
        DruidDataSource  dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(name);
        dataSource.setUrl(url);
        dataSource.setPassword(password);
        return dataSource;
    }


}
