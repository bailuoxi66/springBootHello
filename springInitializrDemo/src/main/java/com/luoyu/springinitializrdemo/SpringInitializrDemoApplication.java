package com.luoyu.springinitializrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//导入Spring的配置文件让其生效
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringInitializrDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInitializrDemoApplication.class, args);
    }

}
