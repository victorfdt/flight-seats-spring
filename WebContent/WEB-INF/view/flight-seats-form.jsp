<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Seats Form</title>

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
				<h1>Flight Seats Form</h1>


				<form:form action="processForm" modelAttribute="flightSeatsForm">
					<!-- Quantity of Rows -->
					<div class="form-group row">
						<form:label path="qtdRows" cssClass="col-sm-2 col-form-label">Quantity of rows: </form:label>
						<div class="col-sm-8">
							<form:input path="qtdRows" cssClass="form-control" />
						</div>
						
						<div class="col-sm-2">
							<form:errors path="qtdRows"
								cssClass="form-control-plaintext error" />
						</div>
					</div>


					<!-- Occupied Seats String -->
					<div class="form-group row">
						<form:label path="occupiedSeats"
							cssClass="col-sm-2 col-form-label">Occupied Seats String: </form:label>
						<div class="col-sm-8">
							<form:input path="occupiedSeats" cssClass="form-control" />
						</div>
						
						<div class="col-sm-2">
							<form:errors path="occupiedSeats"
								cssClass="form-control-plaintext error" />
						</div>
					</div>



					<input type="submit" value="Submit">

				</form:form>

			</div>
		</div>
	</div>

</body>
</html>