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
<h1>Hospital Appointment Application 
</h1>
<br><br><br><br>
<h2> Welcome to Doctor Home Page</h2>
<h3><a href="doctor_profile.jsp">Profile
</a> |
<a href="view_schedule.jsp">View Schedule</a> |
<a href="logout.jsp">Logout</a> 
</h3>
</center>
<br><br><br><br>
<%@page import="java.sql.*" %>
<%
int did=Integer.parseInt(request.getParameter("id"));
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);

ps=con.prepareStatement("select * from doctor where doc_id=?");
ps.setInt(1, did);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<form action= "./doctor_profile_update.jsp" method="post" align="center">
<input type="hidden" name="did" value=<%=rs.getString(1) %>>
<input type="text" name="name" value=<%=rs.getString(2) %>>
<input type="text" name="email" value=<%=rs.getString(3) %>>
<input type="text" name="phone" value=<%=rs.getInt(5) %>>
<input type="text" name="city" value=<%=rs.getString(6) %>>
<select name="speciality" value=<%=rs.getString(7) %>>
<option value="ENT">ENT</option>
<option value="ORTHPEDIC">ORTHOPEDIC</option>
<option value="DENTIST">DENTIST</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
</select>
<!-- <input type="text" name="speciality" value=<%=rs.getString(7) %>>-->
<input type="submit" value="Update">
</form>
<%} %>


</body>
</html>