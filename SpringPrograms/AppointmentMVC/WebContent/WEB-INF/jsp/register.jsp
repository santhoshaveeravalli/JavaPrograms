<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Application</title>
</head>
<body>
<center>
<br><br><br>
<h2>Spring MVC Application Using Hibernate</h2>
<br><br><br>
<h4>
<a href="patient_register.html"> Patient Register</a>
<a href="patient_register.html"> Patient Register</a>
<a href="patient_register.html"> Patient Register</a>
<a href="patient_register.html"> Patient Register</a>
</h4>
<br><br><br>
<form action="patientregister" modelAttribute="register" method="POST">
<input type="text" name="name" placeholder="Enter Name">
<input type="text" name="email" placeholder="Enter Email">
<input type="password" name="password" placeholder="Enter Password">
<input type="text" name="phone" placeholder="Enter Phone">
<input type="text" name="city" placeholder="Enter City">
<input type="submit" value="Register">
</form>
</center>
</body>
</html>