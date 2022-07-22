<!-- Here we have to import the Date class. -->
<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">

		<h1 class="text-center">Who's that Pokemon?</h1>
		
		<form action="/process" method="POST">
			<div class="row">
				<div class="col-3">
					<label for="" class="form-label">Name</label>
				</div>
				<div class="col-6">
					<input type="text" name="name" id="" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col-3">
					<label for="generation" class="form-label">Generation</label>
				</div>
				<div class="col-6">
					<select name="generation" id="" class="form-control">
						<c:forEach var="gen" items="${gens}">
							<option value="${gen}">${gen}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-3">
					<label for="type1" class="form-label">Type 1</label>
				</div>
				<div class="col-6">
					<select name="type1" id="" class="form-control">
						<c:forEach var="type" items="${types}">
							<option value="${type}">${type}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-3">
					<label for="type2" class="form-label">Type 2</label>
				</div>
				<div class="col-6">
					<select name="type2" id="" class="form-control">
						<c:forEach var="type" items="${types}">
							<option value="${type}">${type}</option>
						</c:forEach>
					</select> <input type="submit" value="Submit" class="btn btn-primary" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>