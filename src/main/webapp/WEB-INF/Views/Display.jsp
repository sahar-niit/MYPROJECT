<%@page import="org.springframework.ui.Model"%>
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
  
</head>
<body>

<div class="container">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Electronics EShop</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="/Product">Home</a></li>
      <li ><a href="About">About Us</a></li>
      <li><a href="Contact">Contact Us</a></li> 
      <li><a data-toggle="modal" data-target="#myModal">Login</a></li> 
      <li><a href="Register">Register</a></li> 
       <li class="active"><a href="disp?prd=all">View All</a></li>
    </ul>
  </div>
</nav>
<div>
<form role="form">
  <div class="row">
  <div class="col-sm-6">
  <input type="text" class="form-control" id="search"/>
  </div>
   <div class="col-sm-1">
  <button type="submit" class="btn btn-default">Search</button>
  </div>
</div>
</form>
</div>

<c:set var="product" scope="session" value="${prd}"/>

<table class="table table-striped">
<thead>
	<th>Product Information</th>
	<th>Price</th>
	<th>Qty</th>
	<th></th>
</thead>
<tbody>
<c:if test="${product=='1'}">
	<tr>
			<td>Samsung Mobile J7</td>
			<td>14000</td>
			<td>20</td>
			<td><a href="">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
			
	</tr>
</c:if>
<c:if test="${product=='2'}">
	<tr>
			<td>Dell Laptop Inspiron 1527</td>
			<td>34000</td>
			<td>10</td>
			<td><a href="">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
			
	</tr>
</c:if>
<c:if test="${product=='3'}">
	<tr>
			<td>Canon</td>
			<td>19000</td>
			<td>30</td>
			<td><a href="">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
			
	</tr>
</c:if>
<c:if test="${product=='4'}">
	<tr>
			<td>Samsung Mobile J7</td>
			<td>14000</td>
			<td>20</td>
			<td><a href="">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
			
	</tr>
	<tr>
			<td>Dell Laptop Inspiron 1527</td>
			<td>34000</td>
			<td>10</td>
			<td><a href="">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
			
	</tr>
	<tr>
			<td>Dell Laptop Inspiron 1527</td>
			<td>34000</td>
			<td>10</td>
			<td><a href="">View</a>|<a href="">Edit</a>|<a href="">Delete</a></td>
			
	</tr>
	
</c:if>
</tbody>
</table>
</div>
</body>
</html>