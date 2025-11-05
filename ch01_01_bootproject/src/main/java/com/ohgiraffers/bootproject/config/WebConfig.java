package com.ohgiraffers.bootproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("*")  //origin 등록(어떤 front 서버든 상관 없이)
//                .allowedOrigins("http://localhost:5173")
                // .allowedOrigins("http://localhost:8011")
                .allowedOrigins("http://localhost:30000") //origin 등록(k8s nodeport 이후)
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}