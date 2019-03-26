package com.wzl.controller;

import com.wzl.dao.Car;
import com.wzl.dao.Person;
import com.wzl.dao.Product;
import com.wzl.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
public class TestAction {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);

        Product p = (Product) applicationContext.getBean("product1");
        System.out.println(p);
    }

    @Test
    public void demo2(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);

    }

    @Test
    public void demo3(){
        //ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\Java\\IntelliJIDEA-workspace\\SpringExer\\src\\spring-config.xml");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:spring-config.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);

    }

    /**
     * 方式一 ：
     * 加载多个配置文件可以在定义的使用的时候同时定义多个文件。
     */
    @Test
    public void demo4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml","spring-config2.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);

    }

    @Test
    public void demo5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Person p1 = (Person) applicationContext.getBean("person");
        System.out.println(p1);

        Person p2 = (Person) applicationContext.getBean("personHello");
        System.out.println(p2);

    }
}
