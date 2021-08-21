package com.luoyu.springinitializrdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/20 9:16 下午
 * @description
 */

////这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据返回）
//@ResponseBody
//@Controller

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!" + name;
    }
}
