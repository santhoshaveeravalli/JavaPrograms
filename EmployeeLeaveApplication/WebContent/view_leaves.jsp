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
<h2>View Leaves Page</h2>
<table cellpadding="1" width="500"height="65" ">
<form action="./apply_leave_backend.jsp" method="post">
<tr align="center">
<td>
<a class="tag" href="employee_profile.jsp">View Profile</a>
</td>
<td>
<a class="tag" href="apply_leave.jsp">Apply Leave</a>
</td>
<td>
<a class="tag" href="view_leaves.jsp">View Leave</a>
</td>
<td>
<a class="tag" href="logout.jsp">Logout</a>
</td>
</tr></table>
<br>
<%@page import="java.sql.*" %>
<table border="2",cellpadding="20" width="700"height="100">
<tr align="center">
<td> From Date </td><td>To Date</td><td>Leave Type</td><td>Department </td><td>Manager</td><td>Status</td>
<td>Action</td>
</tr>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id=(Integer)session.getAttribute("emp_id");
ps=con.prepareStatement("select * from leaves where employee_id=?");
ps.setInt(1, id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	%>
	<tr align="center">
<td><%=rs.getDate(4) %></td><td><%=rs.getDate(5) %></td><td><%=rs.getString(6)%></td>
<td><%=rs.getString(8)%></td><td><%=rs.getString(9)%></td><td><%=rs.getString(10) %>
</td><td><a class="tag1" href="delete_leave.jsp?leave_id=<%=rs.getInt(1)%>">Delete</a>

</tr>
	
<% }%>
</table>
</center>
</body>
</html>