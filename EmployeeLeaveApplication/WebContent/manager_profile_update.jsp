<%@page import="java.sql.*" %>
<%
int id = (Integer)session.getAttribute("man_id");
String name= request.getParameter("name");
String email = request.getParameter("email");
String designation = request.getParameter("designation");
String department = request.getParameter("department");
int phone = Integer.parseInt(request.getParameter("phone"));
String city = request.getParameter("city");
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
ps=con.prepareStatement("update manager set name=?,email=?,department=?,phone=?,city=? where man_id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,department);
ps.setInt(4,phone);
ps.setString(5,city);
ps.setInt(6,id);
int x=ps.executeUpdate();
if(x!=0)
	 response.sendRedirect("manager_profile.jsp?msg=Updated");

%>