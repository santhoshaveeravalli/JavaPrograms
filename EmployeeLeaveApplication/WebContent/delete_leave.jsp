<%@page import="java.sql.*" %>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id=Integer.parseInt(request.getParameter("leave_id"));
ps=con.prepareStatement("delete from leaves where leave_id=?");
ps.setInt(1,id);
int i= ps.executeUpdate();
if(i!=0)
	response.sendRedirect("view_leaves.jsp");
%>