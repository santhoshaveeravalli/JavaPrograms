package com.ex;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Utility {

	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring.xml");
		CustomerDAO customerDAO = context.getBean("CustomerDAOBean",CustomerDAO.class);
		
		
		System.out.println("Creating a table in database");
		customerDAO.createTable();
		
		
		System.out.println("Adding the customers");
		customerDAO.addCustomer(1, "First Customer", 1000, 23);
		customerDAO.addCustomer(2, "Second Customer", 2000, 27);
		customerDAO.addCustomer(3, "Third Customer", 3000, 21);
		
		
		System.out.println("Getting all the customers from the database");
		List<Customer_Account> allCustomers = customerDAO.getAllCustomer();
		for(Customer_Account cust : allCustomers)
		{
			System.out.println("Customer ID : " + cust.getId());
			System.out.println("Customer Name : " + cust.getName());
			System.out.println("Customer Balance Amount : " + cust.getAmount());
			System.out.println("Customer Age : " + cust.getAge());
			
		}
	
		
		System.out.println("Getting the total count of all the Customers");
		System.out.println("Total Customers : " + customerDAO.countCustomer());
		
		
		System.out.println("Deleting a Customer with id = 2");
		customerDAO.deleteCustomer(2);
		
		System.out.println("Getting the new total count of all the Customers after deleting a customer");
		System.out.println("Total Customers : " + customerDAO.countCustomer());
	
		
		System.out.println("A customer with id = 1, is depositing an amount of 20000");
		customerDAO.depositAmount(1, 20000);
		
		System.out.println("A customer with id = 3, is withdrawing an amount of 500");
		customerDAO.withdrawAmount(3, 500);
		
		
		
		System.out.println("Getting all the customers from the database and their updated amount :");
		List<Customer_Account> allCustomers2 = customerDAO.getAllCustomer();
		for(Customer_Account cust : allCustomers2)
		{
			System.out.println("Customer ID : " + cust.getId());
			System.out.println("Customer Name : " + cust.getName());
			System.out.println("Customer Balance Amount : " + cust.getAmount());
			System.out.println("Customer Age : " + cust.getAge());
			                                                           
		}
		
	}

}
