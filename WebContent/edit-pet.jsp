<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Pet Project</title>
</head>
<body>
	<form action="editPetServlet" method="post">
		<label for="petName">Name:</label>
		<input type="text" name="petName" value="${petToEdit.petName}" id="petName">
		<label for="petBreed">Breed:</label>
		<input type="text" name="petBreed" value="${petToEdit.petBreed}" id="petBreed">
		<label for="gotchaDate">Gotcha Date:</label>
		<input type="date" name="gotchaDate" value="${petToEdit.petBreed}" id="gotchaDate">
		<input type="hidden" name="id" value="${petToEdit.petId}">
		<input type="submit" value="Save Edited Pet">
	</form>
</body>
</html>