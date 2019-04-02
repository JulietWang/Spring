package com.wzl.service;

import com.wzl.dao.Student;
import com.wzl.dao.StudentDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config3.xml")
public class SpringJdbcTemplates {

	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("studentDAO")
	private StudentDAO studentDAO;

	@Test
	public void demo1(){
		jdbcTemplate.execute("create table t_student(tid int primary key , tname varchar(40))");
	}

	@Test
	public void testSave(){
		Student student = new Student();
		student.setId(1);
		student.setName("王珠玲");
		studentDAO.save(student);
	}

	@Test
	public void findAll(){
		List<Student> students = studentDAO.findAll();
		students.forEach(System.out::println);
	}
}
