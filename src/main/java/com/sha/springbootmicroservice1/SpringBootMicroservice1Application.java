package com.sha.springbootmicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicroservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroservice1Application.class, args);
    }
}