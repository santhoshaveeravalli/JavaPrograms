package com.ex;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CustomerDAO /*extends JdbcDaoSupport*/
{
private JdbcTemplate jdbcTemplate;



	//Creating a table
	public void createTable()
	{
		String query = "create table Customer_Account"
						+ "("
						+ "id int,"
						+ "name varchar(40),"
						+ "amount int,"
						+ "age int"
						+ ")";
		
		jdbcTemplate.execute(query);
	}
	
	
	//Getter for JdbcTemplate
	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	
	//Setter for JdbcTemplate
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	

	
	//Adding a customer
	@Transactional
	public void addCustomer(int id, String name, int amount, int age)
	{
		String query ="insert into Customer_Account values(" + id + ",'" + name + "','" + amount + "'," + age + ")";
		jdbcTemplate.execute(query);
	}
	
	
	//Deleting a customer
	@Transactional
	public void deleteCustomer(int id)
	{
		String query = "delete from Customer_Account where id =" + id ;
		jdbcTemplate.execute(query);
	}
	
	
	//Extracting a count of all the customers
	public int countCustomer()
	{
		String query = "select count(*) from Customer_Account";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
	
	//Getting a List of all customers from database
	public List<Customer_Account> getAllCustomer()
	{
		String query ="select * from Customer_Account";
		return jdbcTemplate.query(query, new ResultSetExtractor<List<Customer_Account>>()
		//Anonymous Inner Class
		{
					
				@Override
				public List<Customer_Account> extractData(ResultSet rs) throws SQLException, DataAccessException
				{
					List<Customer_Account> customers = new ArrayList<Customer_Account>();
					while(rs.next())
					{
						Customer_Account customer = new Customer_Account();
						customer.setId(rs.getInt("id"));
						customer.setName(rs.getString("name"));
						customer.setAmount(rs.getInt("amount"));
						customer.setAge(rs.getInt("age"));
						customers.add(customer);
				}
				return customers;
				}
		});
	}
		
	

	
	@Transactional
	public void depositAmount(int id, int amount)
	{
		getJdbcTemplate().update("update Customer_Account set amount=amount+? where id=?", amount, id);		
	}
	
	
	
	@Transactional
	public void withdrawAmount(int id, int amount)
	{
		getJdbcTemplate().update("update Customer_Account set amount=amount-? where id=?", amount, id);		
	}
}