package com.wzl.service.impl;

import com.wzl.dao.AccountDAO;
import com.wzl.service.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED ,readOnly = true)
public class AccounterviceImpl3 implements AccountService {

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
