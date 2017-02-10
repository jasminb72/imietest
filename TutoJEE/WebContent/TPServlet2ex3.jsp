<%@page import="services.HelloWorld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/TutoJEE/TPServlet2ex3" method="post">
	<input type="checkbox" id="testForward" value="Test forward" name="testForward1">
	<label for="testForward"> Test Forward </label>
	<input type="checkbox" id="testInclude" value="Test Include>" name="testInclude2">
	<label for="testInclude"> Test Include </label>
  <input type="submit" value="Envoyer">
</form>
	


</body>
</html>