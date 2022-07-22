<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<form action="">
		<div class="row">
			<div class="col-3"><label for="" class="form-label">First</label></div>
			<div class="col-9"><input type="text" name="" id="" class="form-control" /></div>
		</div>
		<div class="row">
			<div class="col-3"><label for="" class="form-label">First</label></div>
			<div class="col-9"><input type="text" name="" id="" class="form-control" /></div>
		</div>
		<div class="row">
			<div class="col-3"><label for="" class="form-label">First</label></div>
			<div class="col-9"><input type="text" name="" id="" class="form-control" /></div>
		</div>
		<div class="row">
			<div class="col-3"><label for="" class="form-label">First</label></div>
			<div class="col-9"><input type="text" name="" id="" class="form-control" /></div>
		</div>
		<div class="row">
			<div class="col-3"><label for="" class="form-label">First</label></div>
			<div class="col-9"><input type="text" name="" id="" class="form-control" /></div>
		</div>
		<div class="row">
			<div class="col-3"><label for="" class="form-label">First</label></div>
			<div class="col-9"><input type="text" name="" id="" class="form-control" /></div>
		</div>
		<input type="submit" value="Submit" class="btn btn-primary text-right" />
	</form>


	<h1>Hello World</h1>
	<h2>${candy}</h2>
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Candy</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="candy" items="${candies}">
				<tr>
					<td>${candy}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>