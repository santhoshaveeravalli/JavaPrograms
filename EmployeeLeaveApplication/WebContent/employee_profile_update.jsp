<%@page import="java.sql.*" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String fname= request.getParameter("fname");
String lname= request.getParameter("lname");
String email = request.getParameter("email");
String designation = request.getParameter("designation");
String department = request.getParameter("department");
int phone = Integer.parseInt(request.getParameter("phone"));
String city = request.getParameter("city");
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
ps=con.prepareStatement("update employee set fname=?,lname=?,email=?,designation=?,department=?,phone=?,city=? where emp_id=?");
ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,email);
ps.setString(4,designation);
ps.setString(5,department);
ps.setInt(6,phone);
ps.setString(7,city);
ps.setInt(8,id);
int x=ps.executeUpdate();
if(x!=0)
	 response.sendRedirect("employee_profile.jsp?msg=Updated");
%>