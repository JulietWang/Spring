package com.wzl.dao;

import org.springframework.stereotype.Repository;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
//@Component
@Repository("uDAO") //明确标识持久层 用于对DAO实现类进行标注
public class UserDAO {

    public void save(){
        System.out.println("---添加用户信息---");
    }

    public void update(){
        System.out.println("-----更新用户信息----");
    }

    public void find(){
        System.out.println("-----查询用户信息----");
    }

    public void delete(){
        System.out.println("-----删除用户信息-------");
    }

}
