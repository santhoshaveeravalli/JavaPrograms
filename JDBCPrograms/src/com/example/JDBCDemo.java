package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//Register JDBC Driver
		String url = "jdbc:mysql://localhost:3306/";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
		System.out.println("Connection Established");
		Statement st = con.createStatement();
		//Drop Database
		 String dropquery="drop database jnit";
	     int a = st.executeUpdate(dropquery);
	     System.out.println("Database dropped...");
		 // Database Creation
		 System.out.println("Creating database...");
	     String createdbquery="create database jnit";
	 	 int b = st.executeUpdate(createdbquery);
	     System.out.println("Database created successfully...");
		 //Change Database
	     String usequery="use jnit";
	     int c = st.executeUpdate(usequery);
	     System.out.println("Database Changed");
		//Create table 
		 String createtbquery = "Create table Student (id int(4) primary key, Fname varchar(10), Lname varchar(10), Marks varchar(3), Section char(1), Grade char(1))";
		 int d = st.executeUpdate(createtbquery);
		 System.out.println("Table Created Successfully....");
		//Records Insertion
		System.out.println("Inserting Records...");
		String insertquery ="insert into Student values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertquery);
		//Record 1
		ps.setInt(1, 1063);
		ps.setString(2, "Sai");
		ps.setString(3, "Sam");
		ps.setInt(4, 550);
		ps.setString(5,String.valueOf("A"));
		ps.setString(6, String.valueOf("A"));
		ps.setInt(4,550);
		//Record 2
		ps.setInt(1, 1036);
		ps.setString(2, "abc");
		ps.setString(3, "edf");
		ps.setInt(4, 590);
		ps.setString(5,String.valueOf("A"));
		ps.setString(6, String.valueOf("B"));
		//Record 3
		ps.setInt(1, 1089);
		ps.setString(2, "xyz");
		ps.setString(3, "pqr");
		ps.setInt(4, 490);
		ps.setString(5,String.valueOf("B"));
		ps.setString(6, String.valueOf("A"));
		//Record 4
		ps.setInt(1, 1065);
		ps.setString(2, "dfg");
		ps.setString(3, "klm");
		ps.setInt(4, 460);
		ps.setString(5,String.valueOf("B"));
		ps.setString(6, String.valueOf("B"));
		//Record 5
		ps.setInt(1, 1076);
		ps.setString(2, "Shiva");
		ps.setString(3, "kar");
		ps.setInt(4, 380);
		ps.setString(5,String.valueOf("C"));
		ps.setString(6, String.valueOf("B"));
		//Record 6 
	    ps.setInt(1, 1075);
		ps.setString(2, "Shiv");
		ps.setString(3, "karthik");
		ps.setInt(4, 580);
		ps.setString(5,String.valueOf("A"));
		ps.setString(6, String.valueOf("A"));
		int e = ps.executeUpdate();
		if(e!=0)
			System.out.println("Records Insert");
		//Display
		ResultSet rs = st.executeQuery("Select * from Student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt("marks")+ " "+rs.getString("section")+" "+rs.getString(6));

		
		
			
	} 
				}  
}

	

	


