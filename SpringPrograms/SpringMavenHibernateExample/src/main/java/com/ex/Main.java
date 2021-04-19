package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		SpringHibernate s =(SpringHibernate)app.getBean("jObj");
		Employee emp =  new Employee();
		emp.setEid(1099);
		emp.setEname("Santhu");
		emp.setSalary(123456.876);
		emp.setDept("Development");
		s.saveEmployee(emp);
	}

}
