package com.ex;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {
	@Bean("data")
	public DataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/Jnit_practise");
		dm.setUsername("root");
		dm.setPassword("root");
		return dm;
	}
	@Bean("template")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	@Bean("operations")
	public Operations getOperations() {
		Operations op = new Operations();
		op.setJdbcTemplate(getTemplate(),getDataSource());
		return op;
	}
}
