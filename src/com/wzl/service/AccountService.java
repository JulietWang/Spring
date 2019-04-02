package com.wzl.service;

/**
 * 〈功能简述〉
 * 〈Spring编程式 事务管理TransactionTemplate〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */
public interface AccountService {

	public void transfer(String outAccpunt,String inAccount,double money);
}
