package com.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Properties;
import java.util.Scanner;


public class MainLogic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Properties pobj= new Properties();
		String conn ="hibernate.connection.url";
		String url = "jdbc:mysql://@localhost:3306/jnit";
		String username ="root";
		String password ="root";
        pobj.setProperty(conn,url);
        pobj.setProperty("dialect","org.hibernate.dialect.MySQLDialect");
        pobj.setProperty("hibernate.connection.username",username);
        pobj.setProperty("hibernate.connection.password",password);
        pobj.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        pobj.setProperty("hibernate.hbm2ddl.auto","update");
        pobj.setProperty("hibernate.show_sql","true");
        SessionFactory sfobj=new Configuration().addAnnotatedClass(Student.class).addProperties(pobj).buildSessionFactory();
        Session sobj=sfobj.openSession();
        Transaction transobj=sobj.beginTransaction();
        Student s = new Student();
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        s.setId(id);
        System.out.println("Enter Name:");
        String name = sc.next();
        s.setName(name);
        System.out.println("Enter Dept:");
        String dept = sc.next();
        s.setDept(dept);
        sobj.save(s);
        transobj.commit();
        sobj.close();
        sfobj.close();   
	}
}