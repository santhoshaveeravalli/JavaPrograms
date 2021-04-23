package com.springjdbcmaven;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

@Bean("data")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ss=new DriverManagerDataSource();
		ss.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ss.setUrl("jdbc:mysql://localhost:3306/JNIT");
		ss.setUsername("root");
		ss.setPassword("root");
		return ss;
		
	}
@Bean("template")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbc=new JdbcTemplate();
		jdbc.setDataSource(getDataSource());
		return jdbc;
	}
@Bean("operations")
	public Operations getOperations()
	{
		Operations oo=new Operations();
		oo.setJdbcTemplate(getTemplate(),getDataSource());
		return oo;
	}
}