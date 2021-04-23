package com.ex;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner  {
	@Autowired
    private	Operations op ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);
		
		}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
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

	

