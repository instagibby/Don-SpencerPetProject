<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.Owners" %>
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
		
		<c:forEach items="${requestScope.allPets}" var="currentpet">
		<form class="col-4"  method="post" action="navigationServlet" >
		 	<div class="row">
			 	<div class="col-12" style="text-align: center;">
					<div class='card'>
			          <div class='info'>
			            <h2 class='title'>${currentpet.petName}</h2>           
			            <div class='description'>
			            	<p>ID: ${currentpet.petId}</p>
			            	<p>Breed: ${currentpet.petBreed}</p>
			            	<p>Gotcha Date: ${currentpet.gotchaDate}</p>
			            	
			            </div>
	          		  </div>
			        <input type="hidden" value="${currentpet.petId}" name="id">
			        <input type="hidden" value="${currentpet.petName}" name="petName">
			        <input type="hidden" value="${currentpet.petBreed}" name="petBreed">
			        <input type="hidden" value="${currentpet.gotchaDate}" name="gotchaDate">
			        <div class="row">
			        	<div class="col-6">
							<input class="btn btn-primary" type="submit" value="edit" name="doThisToPet">
						</div>
						<div class="col-6">
							<input class="btn btn-danger" type="submit" value="delete" name="doThisToPet">
						</div>
			        </div>	
				</div>
				</div>
				
				<div class="col-12" style="text-align: center;">
				<d:forEach items="${requestScope.allOwners}" var="currentowner">
					<h3>${currentowner.name } has id: ${currentowner.ownersId }</h3>
					
				</d:forEach>
				</div>
					
			</div>
		</form>
		</c:forEach>
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