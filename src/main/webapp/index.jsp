<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginAppUsingMvc</title>
</head>
<body>
	<form action="ControllerServlet" method="post">
		UserName<input type="text" name="uname" /><br> Password<input
			type="password" name="upassword" /><br> <input type="submit"
			value="login" />

	</form>


</body>
</html>