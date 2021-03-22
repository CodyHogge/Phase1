<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<!-- Bootstrap CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
	crossorigin="anonymous" type="text/javascript"></script>


<!-- AngularJS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"
	type="text/javascript"></script>
	
	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"
	type="text/javascript"></script>

<!-- CSS -->
<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>

<!-- JS files -->
<script type="text/javascript" src='<c:url value="/resources/js/app.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/myHomeController.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/jsComponents/recipeBookComp.js"/>'></script>

<!-- Bootstrap Icons -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<span class="text-danger"><strong>${msg }</strong></span>
<p>----------------------------------------------------------------------------</p>
			
			<c:forEach var="recipe" items="${recipes}">
				<p><strong>*****************************</strong></p>
				<span class="text-info">${recipe.name}</span> - 
				<span class="text-info">${recipe.description}</span>
				<p><strong>*****************************</strong></p>	
			</c:forEach>
			
			<span class="text-danger"> New addition to recipebook </span>
			
			<c:forEach var="recipe" items="${testBooknew}">
				<p><strong>*****************************</strong></p>
				<span class="text-success">${recipe.name}</span> - 
				<span class="text-success">${recipe.description}</span>
				<p><strong>*****************************</strong></p>		
			</c:forEach>
			
			<p>----------------------------------------------------------------------------</p>

<div class="container ml-2">
			<form:form action="addRecipe" modelAttribute="recipe" method="post">
				<label for="recipeName">Recipe Name</label>
				<form:input path="name" placeholder="Recipe Name" id="recipeName" />
				<label for="recipeDescription">Recipe Description</label>				
				<form:input path="description" placeholder="Recipe Description" id="recipeDescription" />
				<button type="submit">Submit</button>				
			</form:form>
	</div>

</body>
</html>