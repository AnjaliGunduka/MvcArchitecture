<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="MvcAritecture.LoginMvcBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>
	<h1>You are Successfully Logged in</h1>
	<%
	LoginMvcBean bean = (LoginMvcBean)request.getAttribute("bean");
	out.print("welcome," + bean.getName());
	%>

</body>
</html>