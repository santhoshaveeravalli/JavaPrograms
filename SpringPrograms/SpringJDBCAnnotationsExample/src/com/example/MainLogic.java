package com.example;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeRow dao=(EmployeeRow)ctx.getBean("edao");
		List<Employee> list=dao.getAllEmployeesRowMapper();
		
		for(Employee e:list)
			System.out.println(e);
	}
}
