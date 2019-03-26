package com.wzl.exer.create;

import org.springframework.stereotype.Component;

/**
 * 〈功能简述〉
 * 〈使用注解的方式 进行bean的注册〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
@Component("helloSpring")
public class HelloSpring {

    public void say(){
        System.out.println("spring 你好");
    }
}
