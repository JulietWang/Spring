package com.wzl.exer.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/4 0004
 */
public class HelloSpringTest {

    public static void main(String[] args) {

        //传统写法 耦合紧密
        HelloSpring hs = new HelloSpringImpl();
        hs.Hello();
        //使用FileSystemXmlApplicationContext和使用ClassPathXmlApplicationContext的区别在于：
        //FileSystemXmlApplicationContext在指定的文件系统路径下查找knight.xml文件；
        //而ClassPathXmlApplicationContext是在所有的类路径（包含JAR文件）下查找knight.xml文件。
        //工厂+映射+配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //利用反射创建对象
        HelloSpring hs1 = (HelloSpring) ac.getBean("hs");
        hs1.Hello();
    }
}
