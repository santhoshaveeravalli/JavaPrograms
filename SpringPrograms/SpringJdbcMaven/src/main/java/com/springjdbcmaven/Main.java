package com.springjdbcmaven;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new AnnotationConfigApplicationContext(Config.class);
		Operations op=(Operations) app.getBean("operations");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert 2.Update 3.Delete");
		int option=sc.nextInt();
		if(option==1)
		{
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Department");
		String dept=sc.next();
		op.insert(id,name,dept);
			}

		else if(option==2)
		{
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter dept");
			String dept=sc.next();
			System.out.println("Enter id");
			int id=sc.nextInt();
			op.update(id, name, dept);
		}
		else if(option==3)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			op.delete(id);
		}
		}

	}

