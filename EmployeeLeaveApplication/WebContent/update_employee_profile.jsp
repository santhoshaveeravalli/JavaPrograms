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
</h1><br>
<h2> Employee Details Update Page</h2>
<table cellpadding="10" width="500"height="65">
<tr align="center">
<td>
<a class="tag" href="employee_profile.jsp">View Profile</a>
</td>
<td>
<a class="tag" href="apply_leave.jsp">Apply Leave</a>
</td>
<td>
<a class="tag" href="view_leave.jsp">View Leave</a>
</td>

<td>

<a class="tag" href="logout.jsp">Logout</a>
</td>
</tr></table>
<%@page import="java.sql.*" %>
<%
int id = (Integer)session.getAttribute("emp_id");
//int id=Integer.parseInt(request.getParameter("id"));
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
ps=con.prepareStatement("select * from employee where emp_id=?");
ps.setInt(1, id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>

<form action= "./employee_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value=<%=rs.getString(1) %>>
<center>
<table cellpadding="5px">
<tr align="center">
<td>First Name:</td>
<td>
<input type="text" name="fname" value=<%=rs.getString(2) %>></td></tr>
<tr align="center">
<td>Last Name:</td>
<td>
<input type="text" name="lname" value=<%=rs.getString(3) %>></td></tr>
<tr align="center"><td>Email:</td><td>
<input type="text" name="email" value=<%=rs.getString(4) %>></td></tr>
<tr align="center"><td>Designation:</td><td>
<input type="text" name="designation" value=<%=rs.getString(6) %>></td></tr>
<tr><td align="center">Department:</td><td>
<select name="department" value=<%=rs.getString(7) %>>
<option value="FINANCE">Finance</option>
<option value="HR">Human Resources</option>
<option value="DEVELOPMENT">Development</option>
<option value="MARKETING">Marketing</option></td></tr>
<tr><td >Date of Birth:</td><td >
<input type="date" name="dob" value=<%=rs.getString(8) %>></td></tr>
<tr align="center"><td>Gender:</td><td>
<input type="text" name="gender" value=<%=rs.getString(9) %>></td></tr>
<tr align="center"><td>Phone:</td><td>
<input type="text" name="phone" value=<%=rs.getInt(10) %>></td></tr>
<tr align="center"><td>City:</td><td>
<input type="text" name="city" value=<%=rs.getString(11) %>></td></tr>
<tr align="center"><td>
<input class="button" type="submit" value="Update"></td></tr>
</table>
</center>
</form>

<%} %>
</body>
</html>