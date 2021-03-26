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

<h2> Manager Details Update Page</h2>
<table cellpadding="10" width="500"height="65">
<tr align="center">
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
<%
int id=Integer.parseInt(request.getParameter("id"));
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
ps=con.prepareStatement("select * from manager where man_id=?");
ps.setInt(1, id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>

<form action= "./manager_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value=<%=rs.getString(1) %>>

<table cellpadding="5px" align="center">
<tr>
<td>Name:</td>
<td>
<input type="text" name="name" value=<%=rs.getString(2) %>></td></tr>
<tr><td>Email:</td><td>
<input type="text" name="email" value=<%=rs.getString(3) %>></td></tr>
<tr>
<td>Department:</td>
<td><select name="department" value=<%=rs.getString(5) %>>
<option value="Finance">Finance</option>
<option value="HR">Human Resource</option>
<option value="Development">Development</option>
<option value="Marketing">Marketing</option>
</select></td></tr>
<tr><td>Phone:</td><td>
<input type="text" name="phone" value=<%=rs.getInt(6) %>></td></tr>
<tr><td>City:</td><td>
<input type="text" name="city" value=<%=rs.getString(7) %>></td></tr>
<tr align="center"><td>
<input class="button" type="submit" value="Update"></td></tr>
</table>
</form>

<%} %>
</body>
</html>