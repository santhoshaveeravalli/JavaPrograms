package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	      Profile profile = (Profile) context.getBean("profile");
	      profile.printId();
	      profile.printName();
	      profile.printMarks();
	      
	}
	}
