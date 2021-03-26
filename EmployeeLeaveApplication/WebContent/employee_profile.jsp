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
<br>
<center>
<h1>
Employee Leave Management Application
</h1>
<br>
<h2> Employee Profile Page</h2>
<table cellpadding="1" width="500"height="65" ">
<tr align="center">
<td>
<a class="tag" href="employee_profile.jsp">View Profile</a>
</td>
<td>
<a class="tag" href="apply_leave.jsp">Apply Leave</a>
</td>
<td>
<a class="tag" href="view_leaves.jsp">View Leaves</a>
<td>
<a class="tag" href="logout.jsp">Logout</a>
</td>
</tr></table>
<br>
<%@page import="java.sql.*" %>
<table border="2",cellpadding="20" width="1100"height="100">
<tr align="center">
<td>First Name</td>
<td>Last Name</td>
<td>Email</td>
<td>Designation</td>
<td>Department</td>
<td>Date of Birth</td>
<td>Gender</td>
<td>Phone</td>
<td>City</td>
<td>Action</td>
</tr>
<%
Connection con = null;
PreparedStatement pst =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
String email=(String)session.getAttribute("email");
pst=con.prepareStatement("select * from employee where email=?");
pst.setString(1, email);
//Statement statement = con.createStatement() ;
ResultSet rs= pst.executeQuery();
//ResultSet rs=statement.executeQuery("select * from employee where email='william.erwin@gmail.com'");
while(rs.next()){
	%>
<tr align="center">
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getInt(10) %></td>
<td><%=rs.getString(11) %></td>
<td>
<a class="tag1" href="update_employee_profile.jsp?id=<%=rs.getInt(1)%>">Update</a>
</td>
</tr>
<% }%>
</table>
</center>
</body>
</html>