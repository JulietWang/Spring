package com.wzl.dao.impl;

import com.wzl.dao.AccountDAO;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 〈功能简述〉
 * 〈Spring编程式 事务管理TransactionTemplate〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

	@Override
	public void outMoney(String outAccpunt, double money) {
		String sql = "update account set money = money -? where name = ?";
		this.getJdbcTemplate().update(sql,money,outAccpunt);
	}

	@Override
	public void inMoney(String inAccount, double money) {
		String sql = "update account set money = money +? where name= ?";
		this.getJdbcTemplate().update(sql,money,inAccount);
	}
}
