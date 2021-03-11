<%@page import="java.sql.*" %>
<%
int did=Integer.parseInt(request.getParameter("did"));
String name= request.getParameter("name");
String email = request.getParameter("email");
int phone = Integer.parseInt(request.getParameter("phone"));
String city = request.getParameter("city");
String speciality = request.getParameter("speciality");
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,city=?,speciality=? where doc_id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setInt(3,phone);
ps.setString(4,city);
ps.setString(5,speciality);
ps.setInt(6,did);
int x=ps.executeUpdate();
if(x!=0)
	 response.sendRedirect("doctor_profile.jsp?msg=Updated");
%>