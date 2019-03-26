package com.wzl.exer.create;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/5 0005
 */
public class UserServiceFactory {

    private static UserService userService = new UserServiceImpl();

    public UserService getUserService() {
        System.out.println("实例化工厂方法...");
        return userService;
    }
}
