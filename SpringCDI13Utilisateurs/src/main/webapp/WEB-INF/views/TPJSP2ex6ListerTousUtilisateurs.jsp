<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<spring:url value="/resources/TPJSP2ex6.css" var="TPJSP2ex6" />	
<link href="${TPJSP2ex6}" rel="stylesheet" />
</head>
<body>
	<header>
	<h1>CDI13</h1>
	</header>
	<main>

		<div class="zoneAjoutUtilisateur">
		<h2>Ajouter nouvel utilisateur</h2>
		<div>
			<form action="/SpringCDI13Utilisateurs/AjouterUtilisateur" method="post">
			<label for="idNom">Nom utilisateur</label> <input type="text"
					id="idNom" name="nom" /> <label for="idEmail">Email</label> <input
					type="text" id="idEmail" name="email" /> <input type="submit"
					value="Valider" />
			</form>
		</div>

	</div>



	<div class="titreListe">Liste personnes</div>
	<div class="tableau">
		<table>
			<thead>
				<tr>
					<td>ID</td>
					<td>Nom</td>
					<td>Email</td>
				</tr>
			</thead>

			<tbody>

				<c:forEach var="utilisateur" items="${utilisateurs}">
					<tr>
						<td><c:out value="${utilisateur.id}" /></td>
						<td><c:out value="${utilisateur.nom}" /></td>
						<td><c:out value="${utilisateur.email}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	</main>

</body>
</html>