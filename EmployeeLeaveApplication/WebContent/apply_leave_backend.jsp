<%@page import="java.sql.*" %>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id =(Integer)session.getAttribute("emp_id");
String fname=(String)session.getAttribute("fname");
String fromdate = request.getParameter("fromdate");
String todate = request.getParameter("todate");
String leave= request.getParameter("leavetype");
String dept= request.getParameter("department");
String man_name = request.getParameter("name");
ps =con.prepareStatement("insert into leaves(employee_id,fname,fromdate,todate,leavetype,department,name) values(?,?,?,?,?,?,?)");
ps.setInt(1,id);
ps.setString(2,fname);	
ps.setString(3, fromdate);
ps.setString(4, todate);
ps.setString(5, leave);
ps.setString(6, dept);
ps.setString(7, man_name);
	int x = ps.executeUpdate();
	if (x!=0)
		response.sendRedirect("view_leaves.jsp");
%>
