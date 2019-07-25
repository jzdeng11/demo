package com.example.demo.controller;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * @Classname HelloControllerTest
 * @Description TODO
 * @Date 2019/7/22 23:36
 * @Created by wo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloController.class)
@WebAppConfiguration
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void HString() {
        TestCase.assertEquals(this.helloController.HString(),"hellojjg");
    }
}