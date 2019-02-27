<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="container">
		<div class="row">
			<div class="col-md-12" style="text-align: center;">
				<h1>Don and Spencer's Pet Project!</h1>
				<hr>
				<h4>Add a pet!</h4>
				<form action="addPetServlet" method="post">
					<div class="row">
						<div class="form-group col-3">
							<label for="name">Name:</label>
							<input class="form-control" type="text" name="name" id="name" required>
						</div>
						<div class="form-group col-3">
							<label for="breed">Breed:</label>
							<input class="form-control" type="text" name="breed" id="breed" required>
						</div>
						<div class="form-group col-3">
							<label for="gotchadate">Gotcha Date:</label>
							<input class="form-control" type="date" name="gotchadate" id="gotchadate" required>
						</div>
						<div class="form-group col-3">
							<label for="ownerId">Owner ID:</label>
							<input class="form-control" type="number" name="ownerId" id="ownerId" min="0" required>
						</div>
					</div>
					<div class="row justify-content-center">
						<button type="submit" class="btn">Add Pet</button>					
					</div>
				</form>
				<hr>
				<h4>Add an owner!</h4>
				<form action="addOwnerServlet" method="post">
					<div class="row justify-content-center">					
						<div class="form-group col-4">
							<label for="ownerName">Owner Name:</label>
							<input class="form-control" type="text" name="ownerName" id="ownerName" required>
						</div>
					</div>
					<div class="row justify-content-center">
						<button type="submit" class="btn">Add Owner</button>
					</div>
				</form>
				
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