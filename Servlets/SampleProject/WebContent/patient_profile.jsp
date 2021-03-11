<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Hospital Appointment Application</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<br><br>
<center>
<h1>
Hospital Appointment Application 
</h1>
<br><br><br><br>
<h2> Welcome to Patient Home Page</h2>

<h3><a href="patient_profile.jsp">Profile
</a> |
<a href="book_appointment.jsp">Book Appointment</a> |
<a href="view_appointment.jsp">View Appointment</a> |
<a href="logout.jsp">Logout</a> 
</h3>

<br><br><br>

<%@page import="java.sql.*" %>
<table border="2",cellpadding="20" width="400"height="100">
<tr>
<td>Name</td><td>Email</td><td>Phone</td><td>City</td><td>Action</td>
</tr>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id=(Integer)session.getAttribute("pat_id");
ps=con.prepareStatement("select * from patient where pat_id=?");
ps.setInt(1, id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	%>
	<tr>
<td><%=rs.getString(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getInt(5) %></td><td><%=rs.getString(6)%></td>
<td><a href="update_patient_profile.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>
	
<% }%>
</table>
</center>
</body>
</html>