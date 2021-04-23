package com.springhibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		//Resource res = new ClassPathResource("spring.xml");
		//BeanFactory bn = new XmlBeanFactory(res);
		SpringHibernate s =(SpringHibernate)app.getBean("jObj");
		Employee emp =  new Employee();
		emp.setEid(1099);
		emp.setEname("Santhu");
		emp.setSalary(123456.876);
		emp.setDept("Development");
		s.saveEmployee(emp);
	}

}
