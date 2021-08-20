package com.luoyu.springinitializrdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/20 10:02 下午
 * @description
 */

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组建中
 * @ConfigurationProperties:告诉SpringBoot将本类中的所有属性和配置文件中的相关配置进行绑定；
 *          prefix = "person" :配置文件中那个下面的所有属性进行一一映射
 * 只有这个组件是容器中的组件，才能使用容器提供的功能ConfigurationProperties
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private String age;
    private Boolean boss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
