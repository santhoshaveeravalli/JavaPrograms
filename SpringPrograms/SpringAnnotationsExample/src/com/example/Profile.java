package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	 @Autowired
	 @Qualifier("student")
	   private Student student;

	   public Profile(){
	      System.out.println("Inside Profile constructor...." );
	   }
	   public void printId() {
	      System.out.println("Id : " + student.getSid() );
	   }
	   public void printName() {
	      System.out.println("Name : " + student.getSname() );
	   }
	    public void printMarks() {
		      System.out.println("Marks : " + student.getMarks() );
}
}