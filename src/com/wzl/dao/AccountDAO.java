package com.wzl.dao;

/**
 * 〈功能简述〉
 * 〈Spring编程式 事务管理TransactionTemplate〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */
public interface AccountDAO {

	public void outMoney(String outAccpunt, double money);
	public void inMoney(String inAccount , double money);
}
