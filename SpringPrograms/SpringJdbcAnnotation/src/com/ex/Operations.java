package com.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class Operations {

	JdbcTemplate jdbcTemplate;
	DataSource dataSource;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate,DataSource dataSource) {
		this.jdbcTemplate = jdbcTemplate;
		this.dataSource = dataSource;
	}
	public void insert(int id,String name,String dept)
	{
		SimpleJdbcInsert insert= new SimpleJdbcInsert(jdbcTemplate).withTableName("student");
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("id",id);
		map.put("name",name);
		map.put("dept",dept);
		int i = insert.execute(map);
		if(i>0)
			System.out.println("Inserted");
		
	}
	public void display(int id) {
		String sql = "select * from student where id=?";
		List<Student> li = jdbcTemplate.query(sql,new RowMapping(),id);
		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st.getName()+" "+st.getDept());
		}
	}
	}
	
