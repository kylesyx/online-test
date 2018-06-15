package com.ks_xlm.Common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new AuthIntercepter()).addPathPatterns("/**").excludePathPatterns("/uc/verify");
    }

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedHeaders("token", "Content-Type", "content-type", "uid");
    }
}
