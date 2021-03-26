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
 * Servlet implementation class employee_register
 */

public class employee_register extends HttpServlet {
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
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String designation=request.getParameter("designation");
		String department= request.getParameter("department");
		String dob= request.getParameter("dob");
		String gender=request.getParameter("gender");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String city= request.getParameter("city");
		
		try {
			ps =con.prepareStatement("insert into employee(fname,lname,email,password,designation,department,dob,gender,phone,city) values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setString(5, designation);
			ps.setString(6, department);
			ps.setString(7, dob);
			ps.setString(8, gender);
			ps.setInt(9, phone);
			ps.setString(10, city);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int x = ps.executeUpdate();
			if (x!=0)
				response.sendRedirect("employee_login.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
}