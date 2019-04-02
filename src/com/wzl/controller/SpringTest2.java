package com.wzl.controller;

import com.wzl.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 〈功能简述〉
 * 〈Spring编程式 事务管理TransactionTemplate
 *   编程式事务 容易存在代码的侵入，会有不安全问题，所以不常使用。通常使用声明式事务管理〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config3.xml")
public class SpringTest2 {

	@Resource(name="accountService")
	private AccountService accountService;

	@Test
	public void testTranfer(){
		accountService.transfer("aaa","bbbb",200);
	}
}
