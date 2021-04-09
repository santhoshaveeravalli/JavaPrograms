package com.annotations;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.Profile;
import com.springcollection.Mobile;

public class MainLogic {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	      Books type = (Books) context.getBean("Books");
	      System.out.println(getAuthor()+" ")
         }
	}
	

	
	 
	 

     