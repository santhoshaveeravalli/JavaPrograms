package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbc {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public void getData() {
	List li = jdbcTemplate.queryForList("select * from employee");
	Iterator i= li.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o.toString());
	}
}
}
