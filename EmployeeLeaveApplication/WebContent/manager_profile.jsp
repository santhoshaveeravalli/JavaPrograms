<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employee Leave Application</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<br><br>
<center>
<h1>
Employee Leave Management Application 
</h1>
<h2> Manager Profile Page</h2>
<table cellpadding="10" width="500"height="65">
<tr>
<td>
<a class="tag" href="manager_profile.jsp">View Profile</a>
</td>
<td>
<a class="tag" href="view_leave_request.jsp">View Leave Request</a>
</td>
<td>
<a class="tag" href="logout.jsp">Logout</a>
</td>
</tr></table>
<%@page import="java.sql.*" %>
<table border="2",cellpadding="40" width="600"height="100" >
<tr align="center">
<td>Name</td><td>Email</td><td>Department</td><td>Phone</td><td>City</td><td>Action</td>
</tr>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
String email=(String)session.getAttribute("email");
ps=con.prepareStatement("select * from manager where email=?");
ps.setString(1, email);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	%>
<tr align="center">
<td><%=rs.getString(2) %></td><td><%=rs.getString(3) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getInt(6) %></td>
<td><%=rs.getString(7)%></td>
<td><a class="tag1" href="update_manager_profile.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>
<% }%>
</table>
</center>
</body>
</html>