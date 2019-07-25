package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

/**
 * @Classname Hello * @Description TODO * @Date 2019/7/20 21:04 * @Created by wo
 */
@RestController //返回resultful风格 不需要写@ResponseBody
public class HelloController {

//    @SpringBootApplication 默认配置了消息转换器
    //定义消息转换器
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        //ISO8859-1
        StringHttpMessageConverter messageConverter = new StringHttpMessageConverter(Charset.forName("ISO8859-1"));
        return messageConverter;
    }

    @RequestMapping(value = "/helloWord")
    //返回的是resultful数据，不使用注解会跳转
//    @ResponseBody
    public String HString(){
        return "xxxxxx,你好";
    }

}
