package com.wzl.service.impl;

import com.wzl.dao.AccountDAO;
import com.wzl.service.AccountService;

/**
 * 〈功能简述〉
 * 〈Spring声明式事务管理TransactionProxyFactoryBean〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */

public class AccounterviceImpl2 implements AccountService {

	private AccountDAO accountDAO;

	@Override
	public void transfer(String outAccpunt, String inAccount, double money) {
		accountDAO.outMoney(outAccpunt,money);
		System.out.println(9/0);
		accountDAO.inMoney(inAccount,money);
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
}
