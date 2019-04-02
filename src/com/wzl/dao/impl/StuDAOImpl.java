package com.wzl.dao.impl;

import com.wzl.dao.StuDAO;

/**
 * 〈功能简述〉
 * 〈实现类〉
 *
 * @author wangzl
 * @create 2019/3/27 0027
 */
public class StuDAOImpl implements StuDAO {
    @Override
    public void add() {
        System.out.println("添加学生-------");
    }

    @Override
    public void find() {
        System.out.println("查找学生-------");
    }

    @Override
    public void delete() {
        System.out.println("删除学生-------");
    }

    @Override
    public void update() {
        System.out.println("更新学生-------");
    }
}
