package com.wzl.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


/**
 * 〈功能简述〉
 * 〈增强--->前置增强通知advice〉
 *
 * @author wangzl
 * @create 2019/3/27 0027
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("----前置增强-----");
        viewSystem();
    }

    public void viewSystem(){
        System.out.println("-----性能监控正在执行----");
    }
}
