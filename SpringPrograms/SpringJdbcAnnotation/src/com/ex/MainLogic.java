package com.ex;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
	ApplicationContext cont = new AnnotationConfigApplicationContext(JavaConfig.class);
	Operations ops = (Operations)cont.getBean("operations");
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Insert 2.Display");
	int options = sc.nextInt();
	if(options==1)
	{
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Dept:");
		String dept = sc.next();
		
	}
	if(options==2)
	{
		
		System.out.println("Enter id :");
		int id = sc.nextInt();
		ops.display(id);
		
	}
	}

}
