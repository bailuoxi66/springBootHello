package com.luoyu.springinitializrdemo;

import com.luoyu.springinitializrdemo.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(SpringInitializrDemoApplicationTests.class);

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

        //日志的级别
        //从低到高

        logger.trace("this trace");
        logger.debug("this debug");
        //SpringBoot默认给我们使用的是info级别的日志
        logger.info("this info");
        logger.warn("this warn");
        logger.error("this error");

    }

}
