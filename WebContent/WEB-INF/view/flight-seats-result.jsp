<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Seats Result</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/spring-mvc.css">

<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1>Flight Seats Result</h1>

				<hr>

				<a href="/flight-seats-spring/">Home Page</a> <br> <a
					href="showLog">See log</a>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<p>Quantity of families: ${result}</p>
			</div>
		</div>
	</div>
</body>
</html>