package com.wzl.controller;

import com.wzl.dao.StuDAO;
import com.wzl.dao.TeacherDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/27 0027
 */
public class SpringTest {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        StuDAO s = (StuDAO) applicationContext.getBean("stuDAOProxy");
        System.out.println(s);

        s.add();
        s.delete();
        s.find();
        s.update();
    }

    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        TeacherDAO s = (TeacherDAO) applicationContext.getBean("teacherDAOProxy");
        System.out.println(s);

        s.save();
        s.delete();
        s.find();
        s.update();
    }
}
