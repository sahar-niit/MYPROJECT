
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.2/angular.min.js"></script>
 <script src="<c:url value='/resources/js/AngularController.js'/>" > </script> 
</head>
<body >

<div class="container" ng-app="myApp" ng-controller="ProductController">
<%@ include file="header.jsp" %>
<div>
<form role="form">
  <div class="row">
  <div class="col-sm-6">
  <input type="text"  ng-model="search.name" class="form-control" />
 
  </div>
   <div class="col-sm-1">
  <button type="submit" class="btn btn-default">Search</button>
  </div>
</div>
</form>
</div>


<c:set var="prd" scope="session" value="${prd}" />
<table class="table" >
<thead>
	<th>Product Information</th>
	<th>Price</th>
	<th>Qty</th>
	<th></th>
</thead>
<tbody>
<c:if test="${prd=='1' }">
<tr ng-repeat="product in Data|filter:{category:'Mobiles'}|filter:search">
 			<td>{{product.name}}</td>
			<td>{{product.price}}</td>
			<td>{{product.qty}}</td>
			<td><a ng-href="product?id={{product.id}}">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
  
  </tr>

</c:if>
<c:if test="${prd=='2' }">
<tr ng-repeat="product in Data|filter:{category:'Laptops'}|filter:search"">
 			<td>{{product.name}}</td>
			<td>{{product.price}}</td>
			<td>{{product.qty}}</td>
			<td><a href="product?id={{product.id}}">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
  
  </tr>

</c:if>
<c:if test="${prd=='3' }">
<tr ng-repeat="product in Data|filter:{category:'Cameras'}|filter:search"">
 			<td>{{product.name}}</td>
			<td>{{product.price}}</td>
			<td>{{product.qty}}</td>
			<td><a href="product?id={{product.id}}">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
  
  </tr>

</c:if>

<c:if test="${prd=='4' }">
 <tr ng-repeat="product in Data|filter:search">
 			<td>{{product.name}}</td>
			<td>{{product.price}}</td>
			<td>{{product.qty}}</td>
			<td><a href="product?id={{product.id}}">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
  
  </tr>
  </c:if>
	

</tbody>
</table>

<%@ include file="footer.jsp" %>
</div>
</body>
</html>