<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Application</title>
</head>
<body><center>
<br><br><br>
Name:<%=request.getAttribute("name") %>
Email:<%=request.getAttribute("email") %>
Phone: <%=request.getAttribute("phone") %>
City:<%=request.getAttribute("city") %>
</center>
</body>
</html>