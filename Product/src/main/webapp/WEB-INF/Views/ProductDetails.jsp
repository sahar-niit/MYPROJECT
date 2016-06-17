<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy Product</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.2/angular.min.js"></script>
 <script src="<c:url value='/resources/js/AngularController.js'/>" > </script> 
</head>
<body style="background-color: #FDFDFD;">
<div class="container" ng-app="myApp" ng-controller="ProductController">
<%@ include file="header.jsp" %>

<div class="table-responsive" ng-repeat="product in Data | filter: { id: '${param.id}'}" >
<center>
<img src="<c:url value='/resources/Images/{{product.category}}/{{product.image}}'/>" height="300" width="300" />
</center>
<table class="table table-striped">
<tr>
	<th>Name</th>
	<td>{{product.name}}</td>
</tr>
<tr>
	<th>Available Quantity</th>
	<td>{{product.qty}}</td>
</tr>
<tr>
	<th>Price</th>
	<td>{{product.price}}</td>
</tr>
<tr>
	<th>Details</th>
	<td>{{product.description}}</td>
</tr>
<tr>
	<th>Category</th>
	<td>{{product.category}}</td>
</tr>

</table>

<form role="form">
<div class="row">
	<div class="col-sm-4">
	 <button type="submit" class="btn btn-default">Add to Cart</button>
	</div> 
	<div class="col-sm-4">
	<button type="submit" class="btn btn-default">View Cart</button>
	</div>
	<div class="col-sm-4">
	<button type="submit" class="btn btn-default">Back to Home</button>
	</div>
</div>
</form>
</div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>