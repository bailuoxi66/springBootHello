package com.luoyu.springinitializrdemo;

import com.luoyu.springinitializrdemo.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.time.Period;

/**
 * SpringBoot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 **/
@SpringBootTest
class SpringInitializrDemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean services = ioc.containsBean("helloServices");
        System.out.println(services);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
