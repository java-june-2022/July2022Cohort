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
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header text-warning bg-danger">Whos that pokemon?</div>
			<div class="card-body">
				<h5 class="card-title">${name}</h5>
				<p class="card-text">${generation} generation</p>
				<h3 class="card-text">Types</h3>
				<p class="card-text">${type1}</p>
				<p class="card-text">${type2 != "None" ? type2 : ""}</p>
				<a href="/" class="btn btn-primary">Go back</a>
			</div>
			<div class="card-footer text-muted">2 days ago</div>
		</div>
		<div class="container text-center">
			<c:forEach var="poke" items="${pokemon}">
				<h3>${poke}</h3>
			</c:forEach>
		</div>
	</div>
</body>
</html>