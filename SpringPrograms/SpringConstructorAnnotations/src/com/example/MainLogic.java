package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		//ApplicationContext app = new ClassPathXmlApplicationContext("springfile.xml");
		//Employee s=(Employee)app.getBean("emp");  
		 
		        Resource r=new ClassPathResource("springfile.xml");  
		        BeanFactory bf=new XmlBeanFactory(r);
		        Profile profile = (Profile)bf.getBean("profile");
		        profile.printId();
		        profile.printName();
		        profile.printDept();
	}

}

