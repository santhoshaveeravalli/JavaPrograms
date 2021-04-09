package com.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		 //SpringJdbc s = (SpringJdbc) app.getBean("javaObj");
 Resource rs = new ClassPathResource("spring.xml");
 BeanFactory bf = new XmlBeanFactory(rs);
 SpringJdbc s =(SpringJdbc)bf.getBean("javaObj");
 s.getData();
 
	}

}
