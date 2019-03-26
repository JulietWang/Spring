package com.wzl.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
@Component("person")
@Scope("prototype") //多例模式 注解定义作用范围
public class Person {
}
