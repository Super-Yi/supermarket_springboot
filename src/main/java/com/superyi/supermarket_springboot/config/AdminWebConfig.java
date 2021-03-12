package com.superyi.supermarket_springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Super-Yi
 * @date 2021/3/10
 **/
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login",
                        "/css/**", "/img/**", "/js/**",
                        "/bill/js/**", "/bill/css/**","/bill/img/**");
    }
}
