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
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="<c:url value='/resources/js/AngularjsController.js'/>"></script>
</head>
<body>
<div class="container" ng-app="myApp" ng-controller="myCtrl">
<%@ include file="header.jsp" %>
	<div class="row">
        <div class="col-md-6">
    		<h2>Search</h2>
            <div id="custom-search-input">
                <div class="input-group col-md-12">
                    <input ng-model="search.name" type="text" class="form-control input-lg" placeholder="Search" />
                    <span class="input-group-btn">
                        <button class="btn btn-info btn-lg" type="button">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                </div>
            </div>
        </div>	
	</div>
	<c:set var="pid" value="${param.id}"></c:set>
	<table class="table table-striped;">
	<tr>
	<th></th>
	<th>Product </th>
	<th>Quantity Available</th>
	<th>Price</th>
	<th></th>
	</tr>
	<c:if test="${pid=='1'}" >
	<tr ng-repeat="product in Data|filter:{category:'Mobiles'}|filter:search" >
	<td><img alt="NO IMAGE" height="50px" width="50px" src="<c:url value='/resources/Images/{{product.category}}/{{product.image}}'/>" /></td>
	<td>{{product.name}}</td>
	<td>{{product.qty}}</td>
	<td>{{product.price}}</td>
	<td>
			<a href="details?id={{product.pid}}" >View</a>|
			  <sec:authorize access="hasRole('ROLE_ADMIN')">
			<a href="edit?id={{product.pid}}" >Edit</a>|
			<a href="delete?id={{product.pid}}" >Delete</a>
			</sec:authorize>
	</td>
	</tr>
	
	</c:if>
	<c:if test="${pid=='2'}" >
	<tr ng-repeat="product in Data|filter:{category:'Laptops'}|filter:search" >
	<td><img alt="NO IMAGE" height="50px" width="50px" src="<c:url value='/resources/Images/{{product.category}}/{{product.image}}'/>" /></td>
	<td>{{product.name}}</td>
	<td>{{product.qty}}</td>
	<td>{{product.price}}</td>
	<td>
			<a href="details?id={{product.pid}}" >View</a>|
			  <sec:authorize access="hasRole('ROLE_ADMIN')">
			<a href="edit?id={{product.pid}}" >Edit</a>|
			<a href="delete?id={{product.pid}}" >Delete</a>
			</sec:authorize>
	</td>
	</tr>
	
	</c:if>
	<c:if test="${pid=='3'}" >
	<tr ng-repeat="product in Data|filter:{category:'Cameras'}|filter:search" >
	<td><img alt="NO IMAGE" height="50px" width="50px" src="<c:url value='/resources/Images/{{product.category}}/{{product.image}}'/>" /></td>
	<td>{{product.name}}</td>
	<td>{{product.qty}}</td>
	<td>{{product.price}}</td>
	<td>
			<a href="details?id={{product.pid}}" >View</a>
			  <sec:authorize access="hasRole('ROLE_ADMIN')">|
			<a href="edit?id={{product.pid}}" >Edit</a>|
			<a href="delete?id={{product.pid}}" >Delete</a>
			</sec:authorize>
	</td>
	</tr>
	
	</c:if>
	<c:if test="${pid=='4'}" >
	<tr ng-repeat="product in Data|filter:search" >
	<td><img alt="NO IMAGE" height="50px" width="50px" src="<c:url value='/resources/Images/{{product.category}}/{{product.image}}'/>" /></td>
	<td>{{product.name}}</td>
	<td>{{product.qty}}</td>
	<td>{{product.price}}</td>
	<td>
			<a href="details?id={{product.pid}}" >View</a>
			  <sec:authorize access="hasRole('ROLE_ADMIN')">|
			<a href="edit?id={{product.pid}}" >Edit</a>|
			<a href="delete?id={{product.pid}}" >Delete</a>
			</sec:authorize>
	</td>
	</tr>
	
	</c:if>
	</table>

<%@ include file="footer.jsp" %>
</div>
</body>
</html>