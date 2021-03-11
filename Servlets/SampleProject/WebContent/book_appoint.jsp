<%@page import="java.sql.*" %>
<%
Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jnit_practise";
String username = "root";
String password = "root";
con = DriverManager.getConnection(url,username,password);
int id =(Integer)session.getAttribute("pat_id");
String patient_name= request.getParameter("patient_name");
String aptdate = request.getParameter("aptdate");
String apttime = request.getParameter("apttime");
//int did = (Integer)session.getAttribute("doc_id");
String docdept= request.getParameter("docdept");
String doc_name = request.getParameter("doc_name");
ps =con.prepareStatement("insert into appointments(patient_id,patient_name,aptdate,apttime,docdept,doc_name) values(?,?,?,?,?,?)");
ps.setInt(1,id);
ps.setString(2,patient_name);	
ps.setString(3, aptdate);
ps.setString(4, apttime);
//ps.setInt(5,did);
ps.setString(5, docdept);
ps.setString(6, doc_name);
	int x = ps.executeUpdate();
	if (x!=0)
		response.sendRedirect("view_appointment.jsp");
%>
