package com.likelion.demo.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    //CORS
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedOrigins(
                        "http://localhost:5173",
                        "http://localhost:8080",
                        "http://hsu-llikelion-frontend.vercel.app")
                .allowedMethods("GET","POST","DELETE","PUT","OPTIONS","PATCH")
                .allowCredentials(true);
    }
}
