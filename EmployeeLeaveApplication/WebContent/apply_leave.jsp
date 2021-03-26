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
<h2>Leave Application Page</h2>
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
<td>
<a class="tag" href="logout.jsp">Logout</a>
</td>
</tr></table>
<br>
<%@page import="java.sql.*" %>
<table cellpadding="10" width="350"height="100">
<tr>
<td align="center">Leave From Date:</td>
<td><input type="date" name="fromdate"></td></tr>
<tr>
<td align="center">Leave To Date:</td>
<td><input type="date" name="todate"></td></tr>
<tr>
<td align="center">Leave Type:</td>
<td> <select name="leavetype">
<option value="Casual">Casual Leave</option>
<option value="Sick">Sick Leave</option>
</select></td></tr>
<tr><td align="center">
Department:</td>
<td>
<select name="department" required>
<option value="Finance">Finance</option>
<option value="HR">Human Resources</option>
<option value="Development">Development</option>
<option value="Marketing">Marketing</option>
</select></td></tr>
<tr align><td align="center"> Manager Name:</td>
<td>
<input type="text" name="name">
</td>
<tr>
<td align="center">
<input class="button" type="submit" value="Submit" >
</td>
</tr>
</table>
</center>
</body>
</html>