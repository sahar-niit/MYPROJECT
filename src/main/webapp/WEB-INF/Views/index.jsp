<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Electronics Shop</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 99%;
      height:550px;
      margin: auto;
  }
  </style>

</head>
<body>
<div class="container">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Electronics EShop</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/Product">Home</a></li>
      <li><a href="About">About Us</a></li>
      <li><a href="Contact">Contact Us</a></li> 
      <li><a data-toggle="modal" data-target="#myModal">Login</a></li> 
      <li><a href="Register">Register</a></li> 
      <li><a href="disp?prd=4">View All</a></li>
    </ul>
  </div>
</nav>
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div style="background-color:lightgreen;"  class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4  class="modal-title">LOGIN</h4>
        </div>
        <div class="modal-body">
        <form role="form">
    <div  class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
     <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="<c:url value="/resources/Images/mobile.jpg" />" alt="MOBILE" />
    </div>

    <div class="item">
      <img src="<c:url value="/resources/Images/digicam.jpg" />" alt="DIGICAM" />
    </div>

    <div class="item">
      <img src="<c:url value="/resources/Images/laptop.jpg" />" alt="LAPTOP"/>
    </div>

    <div class="item">
      <img src="<c:url value="/resources/Images/printer.jpg" />" alt="PRINTER"/>
    </div>
  </div>
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>

</div>
<div style="height:20px;"></div>
<div  class="row">
<div class="col-sm-4"><a href="disp?prd=1"> <img  height="200px;" src="<c:url value="/resources/Images/mobile1.jpg" />" alt="MOBILE" />
</a>

</div>
<div class="col-sm-4">
<a href="disp?prd=2"><img   height="200px;" src="<c:url value="/resources/Images/laptop1.jpg" />" alt="Laptop" />
</a>
</div>
<div class="col-sm-4"><a href="disp?prd=3"> <img  height="200px;" src="<c:url value="/resources/Images/camera1.jpg" />" alt="Camera" /></div>
</a>
</div>
<div>
</div>
<div style="text-align: center;">
	&copy; Copyright 2016-2017 
</div>

</div>
</body>
</html>