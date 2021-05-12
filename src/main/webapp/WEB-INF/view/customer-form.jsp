<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Customer registration form</title>
	</head>
	
	<body>
	
		<i>Fill out the form. Asterisk (*) means required.</i>
		
		<form:form action="processForm" modelAttribute="student">
		
			First name: <form:input path="firstName" />
			<br><br>
			Last name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
			<br><br>
			
			<input type="submit" value="Submit" />
		</form:form>
			
	</body>
</html>