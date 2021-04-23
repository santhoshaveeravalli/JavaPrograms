package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = context.getBean("employee",Employee.class);
		try
		{
			emp.addEmployee();
		}
		catch (Exception exe)
		{
			System.out.println("exception message  = " + exe.getMessage());
		}
		emp.deleteEmployee();

	}
	}


