<%@page import="java.sql.*" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name= request.getParameter("name");
String email = request.getParameter("email");
int phone = Integer.parseInt(request.getParameter("phone"));
String city = request.getParameter("city");
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
ps=con.prepareStatement("update patient set name=?,email=?,phone=?,city=? where pat_id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setInt(3,phone);
ps.setString(4,city);
ps.setInt(5,id);
int x=ps.executeUpdate();
if(x!=0)
	 response.sendRedirect("patient_profile.jsp?msg=Updated");
%>