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
			
			Favourite Programming Languages:<br>
			<form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions }" />
			
			<br><br>
			
			Operating systems:<br>
			Linux<form:checkbox path="operatingSystems" value="Linux" />
			Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
			MS Windows<form:checkbox path="operatingSystems" value="MS Windows" />
			
			<input type="submit" value="Submit" />
		</form:form>
			
	</body>
</html>