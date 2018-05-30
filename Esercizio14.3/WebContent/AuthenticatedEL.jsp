<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profilo Utente</title>
</head>
<body>
<jsp:useBean id="user" class="model.User" scope="session" />

${user.firstName}, benvenuto. <br>
<br>
Questo è il tuo profilo:
<br>
<table border="1">
<tr><td>Nome:</td><td> ${user.firstName}</td></tr>
<tr><td>Cognome:</td><td> ${user.lastName}</td></tr>
<tr><td>Email:</td><td> ${user.email}</td></tr>
</table>
<br>
	<a href="/Esercizio14.3/restricted/RegisterExam.html">Registra Esame</a> - <a href="/Esercizio14.3/restricted/Exams">Mostra esami sostenuti</a>
<br>
	Generato con EL.
</body>
</html>