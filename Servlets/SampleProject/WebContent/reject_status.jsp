<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Appointment Application</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id =(Integer)session.getAttribute("doc_id");
int aid=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("Update appointments set status=? where apt_id=?");
ps.setString(1,"Rejected");
ps.setInt(2,aid);
int i= ps.executeUpdate();
if(i!=0)
	response.sendRedirect("view_schedule.jsp");
%>
</body>
</html> 