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
<!-- CSS -->
<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
<!-- Bootstrap Icons -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">



<!-- AngularJS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.js"
	type="text/javascript"></script>
	
<!-- 	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"
	type="text/javascript"></script> -->

<!-- JS files -->
<script type="text/javascript" src="/helloTest/resources/js/app.js"></script>
<script type="text/javascript" src="/helloTest/resources/js/FreshControl.js"></script>
<script type="text/javascript" src="/helloTest/resources/js/FreshService.js"></script>



<meta charset="ISO-8859-1">
<title>myHome Landing</title>
</head>

<body>
<div ng-app="myHome" ng-controller="FreshControl as ctrl">


	<jsp:include page="components/header.jsp"></jsp:include>

	<div class="row">
		<jsp:include page="components/sidebar.jsp" />
		<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
			<div class="chartjs-size-monitor">
				<div class="chartjs-size-monitor-expand">
					<div class=""></div>
				</div>
				<div class="chartjs-size-monitor-shrink">
					<div class=""></div>
				</div>
			</div>
			<div
				class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
				<h1 class="custH1">${home}	</h1>
				
				
				
				<!-- <div class="btn-toolbar mb-2 mb-md-0">
					<div class="btn-group me-2">
						<button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
						<button type="button" class="btn btn-sm btn-outline-secondary">Export</button>
					</div>
					<button type="button"
						class="btn btn-sm btn-outline-secondary dropdown-toggle">
						<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
							viewBox="0 0 24 24" fill="none" stroke="currentColor"
							stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
							class="feather feather-calendar">
							<rect x="3" y="4" width="18" height="18" rx="2" ry="2"></rect>
							<line x1="16" y1="2" x2="16" y2="6"></line>
							<line x1="8" y1="2" x2="8" y2="6"></line>
							<line x1="3" y1="10" x2="21" y2="10"></line></svg>
						This week
					</button>
				</div> -->
			</div>

			<%-- <div>
			<p class="custH1">${msg }</p>
			<ol>
				<c:forEach var="recipe" items="${recipes }">
				<li>
					<ul>
						<li>Recipe Name = ${recipe.name}</li>
						<li>Recipe Desc = ${recipe.description}</li>
						<li>Recipe Id = ${recipe.id}</li>
					</ul>
				</li>
				<br>
				</c:forEach>
			</ol>
			</div> --%>
			<p>_________________________________________________________________</p>
			
			<h1> JavaScript Recipe List </h1>
			
			<ul>
				<li ng-repeat="ex in list2">
					<span ng-bind="ex.name"></span><br>
					  -> <span ng-bind="ex.description"></span>
					  <br>
				</li>
			</ul>
			<br>
			<p>Total number of recipes: {{ list2.length }}</p>
			
			<p> addition test 1 + 2 = {{ 1 +  2 }}</p>
			
			
			<h2>Section title</h2>
			<div class="table-responsive">
				<table class="table table-striped table-sm">
					<thead>
						<tr>
							<th>#</th>
							<th>Header</th>
							<th>Header</th>
							<th>Header</th>
							<th>Header</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1,001</td>
							<td>random</td>
							<td>data</td>
							<td>placeholder</td>
							<td>text</td>
						</tr>

						<tr></tr>
					</tbody>
				</table>
			</div>
			
		</main>
	</div>
</div>
</body>
</html>