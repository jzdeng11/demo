package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//若启动方法与controller层不在同一包下 需使用@ComponentScan("com.example.demo.controller")扫描告诉启动类controller在哪个包下
//@EnableAutoConfiguration
//@ComponentScan("com.example.demo.controller")
//默认情况下扫描的是当前包及当前包的子包
@SpringBootApplication // 相当于上面的组合注解
// 若启动方法与controller层不在同一包下 需这样扫描告诉启动类controller在哪个包下
//@SpringBootApplication(scanBasePackages ="com.example.demo.controller" )

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
