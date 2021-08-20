package com.luoyu.springinitializrdemo.bean;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/8/20 10:03 下午
 * @description
 */

public class Dog {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
