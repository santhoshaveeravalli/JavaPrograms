package com.sbexample;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext co= SpringApplication.run(Main.class, args);
		Scanner sc = new Scanner(System.in);
		Employee emp =(Employee)co.getBean(Employee.class);
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		emp.setEid(id);
		System.out.println("Enter Name:");
	    String name = sc.next();
		emp.setEname(name);
		System.out.println("Enter Salary:");
		double salary= sc.nextDouble();
		emp.setSalary(salary);
		System.out.println("Enter Dept:");
		String dept = sc.next();
		emp.setDept(dept);
		System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getSalary()+" "+emp.getDept());
		
		
	}

}
