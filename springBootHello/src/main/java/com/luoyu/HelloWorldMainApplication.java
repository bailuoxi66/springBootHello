package com.luoyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/17 6:15 下午
 * @description
 */

/**
 * @author luoyu
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 **/
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
