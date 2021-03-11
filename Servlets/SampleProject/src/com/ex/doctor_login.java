package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class doctor_login
 */

public class doctor_login extends HttpServlet {
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
				
		try {
			ps=con.prepareStatement("select * from doctor where email=? and password=?");
		    ps.setString(1, email);
		    ps.setString(2, password);
		    ResultSet rs = ps.executeQuery();
		    HttpSession hs = request.getSession();
		    if(rs.next()) {
		    	hs.setAttribute("doc_id", rs.getInt(1));
		    	hs.setAttribute("email",rs.getString(3));
		    	hs.setAttribute("speciality",rs.getString(7));
		       	response.sendRedirect("doctor_home.html");
		    }
		    else {
		    	response.sendRedirect("doctor_login.html");
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
	

}
