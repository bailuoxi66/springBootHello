package com.luoyu.springinitializrdemo.config;

import com.luoyu.springinitializrdemo.services.HelloServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/21 3:56 下午
 * @description
 */

/**
 * @Configuration:指明当前类是一个配置类，就是类替代之前的Spring配置文件
 * 在配置文件中，是使用<bean><bean/>来添加组件的
 **/
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloServices helloServices(){
        System.out.println("@Bean给容器中添加组件来");
        return new HelloServices();
    }
}
