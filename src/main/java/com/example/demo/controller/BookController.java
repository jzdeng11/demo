package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname BookController
 * @Description TODO
 * @Date 2019/7/21 20:31
 * @Created by wo
 */
@RestController
public class BookController {

    //取application.properties文件自定义属性
    @Value("${book.author}")
    private String author;

    @Value("${book.name}")
    private String name;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String bookContext(){
        return author +":" + name;
    }

    //支持rest风格
    @RequestMapping("/info/{msg}")
    public String info (@PathVariable String msg){
        return "show"  + msg;
    }
}
