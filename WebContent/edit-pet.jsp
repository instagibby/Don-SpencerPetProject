<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Pets with Don and Spencer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12" style="text-align: center;">
				<h1>Edit A Pet's Info</h1>
				<hr>
				<form action="editPetServlet" method="post">
					<div class="row">
						<div class="form-group col-3">
							<label for="name">Name:</label> <input class="form-control"
								type="text" name="name" id="name" value="${petToUpdate.petName}"
								required>
						</div>
						<div class="form-group col-3">
							<label for="breed">Breed:</label> <input class="form-control"
								type="text" name="breed" id="breed"
								value="${petToUpdate.petBreed}" required>
						</div>
						<div class="form-group col-3">
							<label for="gotchadate">Gotcha Date:</label> <input
								class="form-control" type="date" name="gotchadate"
								id="gotchadate" value="${petToUpdate.gotchaDate}" required>
						</div>
						<div class="form-group col-3">
							<label for="ownerId">Owner ID:</label> <input
								class="form-control" type="number" name="ownerId" id="ownerId"
								min="0" value="${petToUpdate.petId}" required>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>