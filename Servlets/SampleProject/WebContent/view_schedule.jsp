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
<h2> Welcome to Doctor Home Page</h2>

<h3><a href="doctor_profile.jsp">Profile
</a> |
<a href="view_schedule.jsp">View Schedule</a> |
<a href="logout.jsp">Logout</a> 
</h3>
<br><br><br>

<%@page import="java.sql.*" %>
<table border="2",cellpadding="20" width="600"height="100">
<tr>
<td>Patient Name</td><td> Date </td><td>Time</td><td>Status </td>
</tr>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
String spec=(String)session.getAttribute("speciality");
ps=con.prepareStatement("select * from appointments where docdept=?");
ps.setString(1,spec);
ResultSet rs = ps.executeQuery();
while(rs.next())
{	
	%>
	<tr><td><%=rs.getString(3) %> </td>
	<td><%=rs.getDate(4) %></td>
	<td><%=rs.getTime(5) %></td>
	<td>
	<%if(rs.getString(9).equalsIgnoreCase("PENDING"))
	{%>
		<a href="update_status.jsp?id=<%=rs.getInt(1)%>">Accept Status</a> |
		<a href="reject_status.jsp?id=<%=rs.getInt(1)%>">Reject Status</a>
	<%}else{%>
		<%if(rs.getString(9).equalsIgnoreCase("Accepted"))
		{%>
		<%="Accepted" %>
		<%}
		else
		{ %>
		<%="Rejected" %>
		<% }%>
		<% }%>
		</td></tr>
	
	<%}%>
</table>
</center>
</body>
</html>