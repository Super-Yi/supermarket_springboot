package com.superyi.supermarket_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SupermarketSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketSpringbootApplication.class, args);
    }

}
