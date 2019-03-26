package com.wzl.controller;

import com.wzl.dao.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
@Controller //用于对Controller实现类进行标注
public class UserAction {

    @Test
    public void demo1(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring-config.xml");
        Person p1 = (Person)applicationContext.getBean("person");
        System.out.println(p1);

        Person p2 = (Person)applicationContext.getBean("person");
        System.out.println(p2);
    }
}
