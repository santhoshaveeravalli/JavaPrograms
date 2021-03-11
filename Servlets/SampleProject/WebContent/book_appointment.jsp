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
<br>
<center>
<h1>
Hospital Appointment Application
</h1>
<br>
<h2> Appointment Application Page</h2>
<a href="patient_profile.jsp">View Profile</a> |
<a href="book_appointment.jsp">Book Appointment</a> |
<a href="view_appointment.jsp">View appointment</a> |
<a href="logout.jsp">Logout</a>
<br>
<form action="./book_appoint.jsp" method="post">
<input type="text" name="patient_name" placeholder="patientname">
<input type="date" name="aptdate" placeholder="Date">
<input type="time" name="apttime" placeholder="Time">
<select name="docdept">
<option value="ENT">ENT</option>
<option value="ORTHPEDIC">ORTHOPEDIC</option>
<option value="DENTIST">DENTIST</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
</select>
<input type="text" name="doc_name" placeholder="doctor name">
<input type="submit" value="Request">
</form>
</center>
</body>
</html>