package com.ex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MainLogic {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
	    Employee rx = (Employee)app.getBean(Employee.class);
		System.out.println(rx.getEmpid()+" "+rx.getEmpname());
	}

}
