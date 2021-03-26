package com.ex;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientRegistration extends HttpServlet {
	Connection connection=null;
	PreparedStatement statement=null;
	public void init(ServletConfig config)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="root";
			connection=DriverManager.getConnection(url, user, password);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Connection con;
		PreparedStatement ps = null;
		PrintWriter pw = response.getWriter();
		pw.print(connection);
		/*String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		int mob = Integer.parseInt(request.getParameter("mob"));
		String loc = request.getParameter("loc");
		try {
			ps= con.prepareStatement("insert into patient(fname,lname,email,password,gender,phone,city) values(?,?,?,?,?,?,?)");
		    ps.setString(1, fname);
		    ps.setString(2, lname);
		    ps.setString(3, email);
		    ps.setString(4, pass);
		    ps.setString(5,gender);
		    ps.setInt(6,mob);
		    ps.setString(7, loc);
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int x= ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("index.html? msg=success");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}


