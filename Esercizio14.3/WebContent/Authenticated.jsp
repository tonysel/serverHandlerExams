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

<jsp:getProperty name="user" property="firstName" />, benvenuto. <br>
<br>
Questo � il tuo profilo:
<br>
<table border="1">
<tr><td>Nome:</td><td> <jsp:getProperty name="user" property="firstName" /></td></tr>
<tr><td>Cognome:</td><td> <jsp:getProperty name="user" property="lastName" /></td></tr>
<tr><td>Email:</td><td> <jsp:getProperty name="user" property="email" /></td></tr>
</table>
<br>
	<a href="/Esercizio14.3/restricted/RegisterExam.html">Registra Esame</a> - <a href="/Esercizio14.3/restricted/Exams">Mostra esami sostenuti</a>
</body>
</html>