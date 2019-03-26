package com.wzl.exer.create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/4 0004
 */
public class Bean1 {

    @Test
    public void demo1(){
        //工厂+映射+配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //利用反射创建对象
        Bean1 bean1 = (Bean1) ac.getBean("bean1");
        System.out.println(bean1);
    }

    @Test
    public void demo2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //使用静态工厂方法装配Bean
        ClientService clientService = (ClientService) ac.getBean("clientService");
        System.out.println(clientService);
    }

    @Test
    public void demo3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //使用静态工厂方法装配Bean
        UserService userService = (UserService) ac.getBean("userService");
        System.out.println(userService);
    }

    /**
     * 1:bean的作用域 singleton/prototype
     */
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Product p1 = (Product)applicationContext.getBean("product");
        System.out.println(p1);

        Product p2 = (Product)applicationContext.getBean("product");
        System.out.println(p2);
    }

    //web相关的四个作用域 request session application websocket

    /**
     * Request作用域的设置
     * 首先配置 监听 然后在指定作用域
     */
    public void test2(){

    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }

    /**
     * 属性的合并
     */
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Parent child = (Parent) applicationContext.getBean("child");
        Properties properties = child.getAdminEmails();
        properties.list(System.out);
    }

    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.say();
    }

}
