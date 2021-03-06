<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./ressources/TPJSP2ex6.css">
</head>
<body>
	<header>
	<h1>CDI13</h1>
	</header>
	<main>

	<div class="zoneAjoutUtilisateur">
		<h2>Ajouter nouvel utilisateur</h2>
		<div>
			<form action="/TutoJEE/TPJSP2ex6ListerTousUtilisateurs" method="post">
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