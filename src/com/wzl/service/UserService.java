package com.wzl.service;

import com.wzl.dao.UserDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/5 0005
 */
@Service("userService") //用于对Service实现类进行标注
public class UserService {
    //1普通属性的注入
    //如果使用xml注入 ----> setter方法 构造函数
    //如果使用注解注入 基本类型都可以使用@Value
    @Value("wangzl")
    private String name;

    //2引用类型的注入
    //使用注解@AutoWired
    //使用@Autowired默认是使用类型注入 如果对应的类型不存在则报错 如果不想报错 使用属性required = false
/*    @Autowired(required = false)
    @Qualifier("uDAO")//指定名称注入*/
    @Resource(name = "uDAO") //@Resource 等价于 @Autowired
    private UserDAO dao;
}
