<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Don & Spencer Project</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container col-lg-9" style="padding-top: 15px">
		<div class="row">
			<div class="col-12 " style="text-align: center;">
			
			<h1>Update Pets</h1>
				<form class="row" action="editPetServlet" method="post">
			
					<div class="form-group col-4">
						<label for="petName">Name:</label>
						<input class="form-control" type="text" name="petName" value="${petToEdit.petName}" id="petName">
					</div>
					<div class="form-group col-4">
						<label for="petBreed">Breed:</label>
						<input class="form-control" type="text" name="petBreed" value="${petToEdit.petBreed}" id="petBreed">
					</div>
					<div class="form-group col-4">
						<label for="gotchaDate">Gotcha Date:</label>
						<input class="form-control" type="date" name="gotchaDate" value="${petToEdit.gotchaDate}" id="gotchaDate">
					</div>
					<hr>
					<div class="col-12">
						<input type="hidden" name="id" value="${petToEdit.petId}">
						<input type="submit" class="btn btn-success" value="Save Edited Pet">
					</div>
				</form>
				<div class="row">
					<div class="col-12">
						<hr>
						<h3><a href="index.jsp">Add Pet</a></h3>
					</div>
					
				</div>
			</div>
		</div>
		
	</div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
