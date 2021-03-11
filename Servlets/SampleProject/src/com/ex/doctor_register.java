package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class doctor_register
 */

public class doctor_register extends HttpServlet {
Connection con = null;
PreparedStatement ps =null;

public void init(ServletConfig config){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url = "jdbc:mysql://localhost:3306/jnit_practise";
	String username = "root";
	String password = "root";
	try {
		con = DriverManager.getConnection(url,username,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	int phone = Integer.parseInt(request.getParameter("phone"));
	String city= request.getParameter("city");
	String speciality= request.getParameter("speciality");
	
	try {
		ps =con.prepareStatement("insert into doctor(name,email,password,phone,city,speciality) values(?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setInt(4, phone);
		ps.setString(5, city);
		ps.setString(6, speciality);
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		int x = ps.executeUpdate();
		if (x!=0)
			response.sendRedirect("doctor_login.html");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
