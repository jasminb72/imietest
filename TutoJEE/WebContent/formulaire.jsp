<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>URL pour appeler cette page:http://localhost:8080/TutoJEE/formulaire.jsp </br> </p>
<form action ="MonServlet1" method="post"> 
<p>nom:</p> <input type="text" name="nom"/>
<p>prenom:</p> <input type="text" name="prenom"/>
    	<input type="submit"/>
<br/>
<%
String coucou="</br>coucou toi";


%>
<%=coucou 



%>

</body>
</html>