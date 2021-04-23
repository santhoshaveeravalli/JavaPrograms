package com.springjdbcmaven;

import java.sql.Types;
import java.util.HashMap;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.object.SqlUpdate;

	public class Operations
	{
		JdbcTemplate jdbcTemplate;
		DataSource datasource;
		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate,DataSource datasource) {
			this.jdbcTemplate = jdbcTemplate;
			this.datasource=datasource;
		}
		
		public void insert(int id,String name,String dept)
		{
			SimpleJdbcInsert ins=new SimpleJdbcInsert(jdbcTemplate).withTableName("student");
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("id", id);
			map.put("name",name);
			map.put("dept", dept);
			int i=ins.execute(map);
			if(i>0)
				System.out.println("Inserted into table Student");
		}
		
		public void update(Integer id,String name,String dept)
		{
			String sql="update student set name=? ,dept=? where id=?";
			SqlUpdate updateobj=new SqlUpdate(datasource, sql);
			updateobj.declareParameter(new SqlParameter("name", Types.VARCHAR));
			updateobj.declareParameter(new SqlParameter("dept", Types.VARCHAR));
		    updateobj.declareParameter(new SqlParameter("id", Types.INTEGER));
		      updateobj.compile();
		      
		    int i= updateobj.update(name.toString(),dept.toString(),id.intValue());
		    if(i>0)
		    System.out.println("Updated");
			
		}
		public void delete(int id)
		{
			String sql="delete from student where id=?";
			int i=jdbcTemplate.update(sql,id);
			if(i>0)
				System.out.println("Deleted ");
		}
		
	}

