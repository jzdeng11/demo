package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname BookBController
 * @Description TODO
 * @Date 2019/7/21 20:56
 * @Created by wo
 */
@RestController
// application.properties 自定义属性过多 通过@Value()获取太麻烦 可以用@ConfigurationProperties(prefix = "book")
//获取application.properties文件里自定义属性前缀为book的属性 ,但是要写get，set方法获取属性值
@ConfigurationProperties(prefix = "book") //类型安全的配置
public class BookBController {

    private String author;

    private String name;

    @RequestMapping(value = "/bookB")
    public String bookInfo(){
        return author + "B:" + name ;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
