<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Student registration form</title>
	</head>
	
	<body>
		
		<form:form action="processForm" modelAttribute="student">
		
			First name: <form:input path="firstName" />
			<br><br>
			Last name: <form:input path="lastName" />
			<br><br>
			
			Country:
			<form:select path="country">
				<form:options items="${theCountryOptions}" />
			</form:select>
			<br><br>
			
			Favourite Programming Languages:
			Java<form:radiobutton path="favouriteLanguage" value="Java" />
			C#<form:radiobutton path="favouriteLanguage" value="C#" />
			PHP<form:radiobutton path="favouriteLanguage" value="PHP" />
			Ruby<form:radiobutton path="favouriteLanguage" value="Ruby" />
			
			<br><br>
			
			<input type="submit" value="Submit" />
		</form:form>
			
	</body>
</html>