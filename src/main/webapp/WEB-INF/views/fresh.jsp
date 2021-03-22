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
	
		<h3>vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv</h3>
		<br>
		<h1><span ng-bind="test"></span></h1>
		<br>
		<h3>^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^</h3>
	<br>
	<br>
	<h3>#############################################</h3>
	<br>
	<ul>
		<li ng-repeat="ex in list">
			<span ng-bind="ex.name"></span><br>
			<span ng-bind="ex.desc"></span>	
	</ul>
	<br>
	<p>Number of ex's in $scope.list : {{ list.length }}</p>
	<br>
	<h3>#############################################</h3>
	<br>
	<br>
	<h3>#############################################</h3>
	<br>
	<ul>
		<li ng-repeat="ex2 in list2">
			<span ng-bind="ex2.name"></span><br>
			<span ng-bind="ex2.desc"></span>	
	</ul>
	<br>
	<p>Number of ex's in $scope.list2 : {{ list2.length }}</p>
	<br>
	<h3>#############################################</h3>
	
	</div>
</body>
</html>