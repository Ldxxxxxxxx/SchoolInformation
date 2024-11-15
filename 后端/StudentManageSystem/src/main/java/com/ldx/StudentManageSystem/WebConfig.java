package com.ldx.StudentManageSystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 允许跨域的路径

                .allowedOrigins("*") // 允许所有域名访问
                .allowedMethods("GET", "POST", "PUT", "DELETE"); // 允许的方法
    }
}