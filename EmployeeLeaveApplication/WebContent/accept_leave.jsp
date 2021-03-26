<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Leave Management Application</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id =(Integer)session.getAttribute("man_id");
int lid=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("Update leaves set manager_id=?,status=? where leave_id=?");
ps.setInt(1,id);
ps.setString(2,"Accepted");
ps.setInt(3,lid);
int i= ps.executeUpdate();
if(i!=0)
	response.sendRedirect("view_leave_request.jsp");
%>
</body>
</html> 