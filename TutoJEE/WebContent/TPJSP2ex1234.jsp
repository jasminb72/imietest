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

	<!--  //pas besoin d'accéder en usebean avec le langage EL
	//<jsp:useBean id="personne1" class="DTO.Personne" scope="request" /> -->

	<br />Voici le nom avec du EL : ${personne1.nom}
	<br />Voici le nom avec du EL et la taglib Core:
	<c:out value="${personne1.nom}" />

	<!-- pas besoin d'accéder en usebean avec le langage EL
	<jsp:useBean id="loisirs" class="java.util.ArrayList" scope="request"/> -->
	
	<br/>====Liste des loisirs=====
	<c:forEach var="loisir" items="${loisirs}">
		<br/><c:out value="${loisir}" />
	</c:forEach>

	<%-- <jsp:useBean id="loisirs" class="java.util.ArrayList" scope="request"/> --> --%>



</body>
</html>