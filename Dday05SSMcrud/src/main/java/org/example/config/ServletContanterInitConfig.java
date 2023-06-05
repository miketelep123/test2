package org.example.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletContanterInitConfig extends AbstractDispatcherServletInitializer {

    //1.加载springMVC的配置,产生一个springMVC的容器(spring容器)
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx =
                new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);
        return ctx;
    }

    //2.配置映射地址
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //3.加载spring配置的文件
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    @Override  //过滤器   --->保留原来的过滤器
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter =  new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return new Filter[]{characterEncodingFilter};
    }





}
