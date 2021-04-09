package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Profile {
	 @Autowired
	// @Qualifier("employee")
	   private Employee employee;

	  
	   public void printId() {
	      System.out.println("Id : " + employee.getId() );
	   }
	   public void printName() {
	      System.out.println("Name : " + employee.getName() );
	   }
	    public void printDept() {
		      System.out.println("Dept : " + employee.getDept() );
}
}