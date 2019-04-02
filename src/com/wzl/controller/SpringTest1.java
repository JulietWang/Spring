package com.wzl.controller;

import com.wzl.dao.ProductDAO;
import com.wzl.dao.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/28 0028
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config2.xml")
public class SpringTest1 {

    /*@Resource(name = "stuDAO")
    private StuDAO stuDAO;

    @Autowired
    @Qualifier("teacherDAO")
    private TeacherDAO teacherDAO;
*/
    @Autowired
    @Qualifier("uDAO")
    private UserDAO userDAO;

   /* @Test
    public void demo1(){
        stuDAO.add();
        stuDAO.delete();
        stuDAO.find();
        stuDAO.update();

        teacherDAO.save();
        teacherDAO.delete();
        teacherDAO.find();
        teacherDAO.update();
    }
*/
    @Test
    public void demo2(){

        userDAO.save();
        userDAO.delete();
        userDAO.find();
        userDAO.update();
    }

    @Resource(name="productDAO")
    private ProductDAO productDAO;

    @Test
    public void demo3(){

        productDAO.addProduct();
        productDAO.deleteProduct();

    }
}
