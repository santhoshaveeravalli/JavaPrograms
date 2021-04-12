package com.ex;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapping implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet res, int arg) throws SQLException {
		Student s = new Student();
		s.setId(res.getInt("id"));
		s.setName(res.getString("name"));
		s.setDept(res.getString("dept"));
		
		s.getId();
		s.getName();
		s.getDept();
		
		return null;
	}

}
