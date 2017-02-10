<!DOCTYPE html>
<%@ page import="fr.imie.cours.Person"%>
<%@ page import="java.text.*"%>
<%@ page import="java.time.*"%>
<%@ page import="java.time.format.*"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/tld/imie.tld" prefix="imie" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- commentaire visible par le nav -->
	<%-- commentaire invisible --%>

	<%
		String test = "test";
	%>
	<%=test%><br />

	<jsp:scriptlet>String test2 = "test2";</jsp:scriptlet>
	<jsp:expression>test2</jsp:expression><br />

	<%!String var_instance = "instance";%>
	<jsp:declaration>String var_instance2 = "instance";</jsp:declaration>

	<%-- <jsp:scriptlet> --%>
	// Person p1 = (Person) session.getAttribute("p1"); // if ( p1 == null
	) { // p1 = new Person(); // session.setAttribute("p1", p1); // }
	<%-- </jsp:scriptlet> --%>
	<%-- <jsp:expression>p1.getLastName()</jsp:expression> --%>

	<%-- <jsp:useBean id="p2" class="fr.imie.cours.Person" scope="session" /> --%>
	<%-- <jsp:getProperty name="p2" property="firstName" /> --%>

	${p2.firstName} Bonjour
	<%=System.getProperty("user.name")%><br />
	<form>
		prenom : <input name="prenom" /><br /> nom : <input name="nom" /><br />
		<input type="submit" /><br />
	</form>

	<br />TP jsp 1 ex 2
	<br />
	<%=request.getParameter("prenom")%><br />
	<%=request.getParameter("nom")%><br />

	<br />TP jsp 1 ex 2bis
	<br />
	<form action="tpsaison">
		<select name="saison">
			<%
				List<String> liste_saisons = Arrays.asList("printemps", "ete", "automne", "hiver");
				for (String saison : liste_saisons) {
			%><option><%=saison%></option>
			<%
				}
			%>
		</select> <select name="saison">
			<%
				for (String saison : liste_saisons) {
					out.write("<option>");
					out.write(saison);
					out.write("</option>");
				}
			%>
		</select> <input type="submit" />
	</form>

	<br />TP jsp 1 ex 3
	<br />

	<!-- en utilisant l'ancienne librairie java.util.Date : <br/> -->
	<%-- <%=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())%><br/> --%>
	<%-- <%=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.FRENCH).format(new Date())%><br/> --%>

	<!-- en utilisant la nouvelle librairie java.time.* : <br/> -->
	<%-- <%=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", Locale.FRENCH).format(LocalDateTime.now())%><br/> --%>
	<%-- <%=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM).withLocale(Locale.FRENCH).format(LocalDateTime.now())%><br/> --%>

	<%
		DateFormat oldDateFormatter;
		DateTimeFormatter newDateFormatter;
		Date oldDateJour;
		LocalDateTime newDateJour;
		String strJour;

		oldDateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		oldDateFormatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, Locale.FRENCH);

		newDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", Locale.FRENCH);

		newDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM).withLocale(Locale.FRENCH);

		oldDateJour = new Date();
		newDateJour = LocalDateTime.now();

		strJour = oldDateFormatter.format(oldDateJour);
		strJour = newDateFormatter.format(newDateJour);
	%>
	<%=strJour%><br />

	<br />TP jsp 1 ex 4
	<br />

	<table>
		<%
			for (int ii = 1; ii <= 20; ii = ii + 1) {
		%><tr>
			<td style="border: 1px solid">Nombre</td>
			<td style="border: 1px solid"><%=ii%></td>
		</tr>
		<%
			}
		%>
	</table>

	It�ration sur les nombres de 1 � nbMax

	<table>
		<c:forEach var="ii" begin="1" end="${nbMax}" step="1">
			<tr>
				<td style="border: 1px solid">Toto</td>
				<td style="border: 1px solid">${ii}</td>
			</tr>
		</c:forEach>
	</table>

	Parcours des �l�ments d'un arraylist

	<ul>
		<c:forEach var="saison" items="${listeSaisons}">
			<li>${saison}</li>
		</c:forEach>
	</ul>

	<c:if test="${ nbMax gt 10 }">
	nbMax est plus grand que 10
</c:if>

	<c:choose>
		<c:when test="${ nbMax gt 10 }">nbMax est plus grand que 10</c:when>
		<c:when test="${ nbMax lt 10 }">nbMax est plus petit que 10</c:when>
		<c:otherwise>nbMax est egale � 10</c:otherwise>
	</c:choose>

	<br />

	<c:if test="${ empty toto }"> toto est null ou vide </c:if>
	<br />
	<c:if test="${ not empty listeSaisons }"> taille : ${ listeSaisons.size() } </c:if>
	<br />

	<imie:somme a="2" b="5" />

</body>
</html>
