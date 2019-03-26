package com.wzl.service;

import com.wzl.dao.CustomerDAO;
import com.wzl.dao.OrderDAO;

import javax.annotation.Resource;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/26 0026
 */
public class CustomerService {

    //xml ---> setter 构造函数
    private CustomerDAO customerDAO;

    //注解
    @Resource(name = "orderDAO")
    private OrderDAO orderDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerDAO=" + customerDAO +
                ", orderDAO=" + orderDAO +
                '}';
    }
}
