package com.wzl.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/28 0028
 */
@Component
@Aspect
public class MyAspect {
    /**
     * 使用AspectJ实现AOP(基于XML的方式)
     */
    public void beforeMethod(){
        System.out.println("前置增强1========");
    }

    public void afterMethod(){
        System.out.println("后置增强2=========");
    }
    //环绕增强
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("---前置增强---环绕--");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("---后置增强---环绕--");
        return result;
    }

/*
    //方法名就是切点的名字
    @Pointcut("execution(* find(..))")
    public void mypointcut(){

    }

    //应用环绕增强
    @Before("MyAspect.mypointcut()")
    public void beforeMethod(){
        System.out.println("前置增强1========");
    }
    @After("MyAspect.mypointcut()")
    public void afterMethod(){
        System.out.println("后置增强2=========");
    }
*/


/*    @Before("execution(* save(..))")
    public void beforeMethod(){
        System.out.println("前置增强1========");
    }

    @After("execution(* delete())")
    public void afterMethod(){
        System.out.println("后置增强2=========");
    }*/
}
