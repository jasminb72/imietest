<%@page import="DTO.Personne"%>
<%@page import="services.HelloWorld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/TutoJEE/TPJSP2ex5" method="post">
		<label for="idNom">Nom utilisateur</label> 
		<input type="text" id="idNom" name="Nom" /> 
		<label for="idEmail">Email</label> 
		<input type="text" id="idEmail" name="email" /> 
		<input type="submit" value="Valider" />
	</form>
	<jsp:useBean id="personne1" class="DTO.Personne" scope="request" />

	<c:if test="${empty param.email}">
		<p>Saisie d'un nouveau compte</p>
	</c:if>
	
	<c:if test="${boolEmailValide==false}">
		<p>Mauvais email! Veuillez corriger</p>
	</c:if>	
	


</body>
</html>