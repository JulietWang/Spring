package com.wzl.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/4/1 0001
 */
public class StudentDAO extends JdbcDaoSupport {

	public void save(Student student) {
		String sql = "insert into t_student values(?,?)";
		Object[] args = {student.getId(), student.getName()};
		this.getJdbcTemplate().update(sql, args);
	}

	public void update(Student student) {
		String sql = "update t_student set name=? where tid=?";
		Object[] args = {student.getName(), student.getId()};
		this.getJdbcTemplate().update(sql, args);
	}

	public void delete(String id) {
		String sql = "delete fromt_student where tid=?";
		this.getJdbcTemplate().update(sql, id);
	}

	public int count() {
		String sql = "select count(*) from t_student";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}

	public List<Student> findAll() {
		String sql = "select * from t_student";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}

	class StudentRowMapper implements RowMapper<Student> {
		@Override
		public Student mapRow(ResultSet resultSet, int i) throws SQLException {
			Student student = new Student();
			student.setId(resultSet.getInt("tid"));
			student.setName(resultSet.getString("tname"));
			return student;
		}
	}
}
