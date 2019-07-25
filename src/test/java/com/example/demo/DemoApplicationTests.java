package com.example.demo;

import com.example.demo.controller.BookBController;
import com.example.demo.controller.HelloController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloController.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoads() {
        TestCase.assertEquals(this.helloController.HString(),"hellojg");
    }

}
