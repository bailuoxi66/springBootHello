package com.luoyu.springinitializrdemo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

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
 * @ConfigurationProperties(prefix = "person")：默认从全局配置中获取值
 **/

//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {

    /**
     * <bean class="Person">
     *      <property name="lastName" value="?" </property>
     * </bean>
     * 分析下：value支持什么？字面量/${key}从环境变量、配置文件中获取/#{SpEL}
     **/
    //@Value("${person.last-name}")
    //结合Validated，判断当前lastName的填充内容是否是邮箱
    //@Email
    private String lastName;
    //@Value("#{11*2}")
    private String age;
    //@Value("false")
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
