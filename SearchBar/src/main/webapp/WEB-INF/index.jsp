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
		<link rel="stylesheet" href="/css/main.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
<body>
   <div class="container">
   		<form action="/search/">
   			<div class="row">
   				<div class="col-3">
   					<label class="form-label"></label>
   				</div>
   				<div class="col-6">
   					<input type="text" name="name" class="form-control" />
	   				<input type="text" name="pumpernickle" id="" class="form-control" />
	   				<input type="submit" value="Submit" class="btn btn-primary" />
   				</div>
   			</div>
   		</form>
   </div>
   
</body>
</html>