package com.wzl.service;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/27 0027
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        viewSystem();
        Object result = methodInvocation.proceed();
        writeLog();
        return result;
    }

    public void viewSystem(){
        System.out.println("-----性能监控正在执行----");
        System.out.println("-----安全检查也已开启----");
    }

    public void writeLog(){
        System.out.println("-----相关日志信息正在记录----");
    }
}
