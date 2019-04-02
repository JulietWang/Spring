package com.wzl.service.impl;

import com.wzl.dao.AccountDAO;
import com.wzl.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 〈功能简述〉
 * 〈Spring编程式 事务管理TransactionTemplate〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */
public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;
	//定义事物管理模版
	private TransactionTemplate transactionTemplate;

	@Override
	public void transfer(String outAccpunt, String inAccount, double money) {

		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDAO.outMoney(outAccpunt,money);
				System.out.println(9/0);
				accountDAO.inMoney(inAccount,money);
			}
		});
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
}
