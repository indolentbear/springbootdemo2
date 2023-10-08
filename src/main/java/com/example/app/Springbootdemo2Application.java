package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.controller"})
public class Springbootdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo2Application.class, args);
    }

}
