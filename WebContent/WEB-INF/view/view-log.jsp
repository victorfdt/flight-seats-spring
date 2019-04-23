<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/spring-mvc.css">

<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<title>Flight Seats View Form</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1>Flight Seats Log View</h1>

				<hr>

				<a href="/flight-seats-spring/">Home Page</a>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<c:forEach var="line" items="${log}">
					<p>${line}</p>
				</c:forEach>
			</div>
		</div>
	</div>

</body>
</html>