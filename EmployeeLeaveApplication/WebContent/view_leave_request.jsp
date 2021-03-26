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
<h2> View Leave Request Page</h2>
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
<table border="2",cellpadding="20" width="600"height="100">
<tr align="center">
<td>Employee Name</td><td> From Date </td><td>To Date</td><td>Leave Reason</td><td>Status </td>
</tr>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
String dept=(String)session.getAttribute("department");
ps=con.prepareStatement("select * from leaves where department=?");
ps.setString(1,dept);
ResultSet rs = ps.executeQuery();
while(rs.next())
{	
	%>
	<tr align="center">
	<td><%=rs.getString(3) %> </td>
	<td><%=rs.getDate(4) %></td>
	<td><%=rs.getDate(5) %></td>
	<td><%=rs.getString(6) %> </td>
	<td>
	<%if(rs.getString(10).equalsIgnoreCase("PENDING"))
	{%>
		<a class="tag1" href="accept_leave.jsp?id=<%=rs.getInt(1)%>">Accept</a> |
		<a class="tag1" href="reject_leave.jsp?id=<%=rs.getInt(1)%>">Reject</a>
	<%}
	else
	{%>
		<%if(rs.getString(10).equalsIgnoreCase("Accepted"))
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
</body>
</html>