<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
      width: 100%;
      height:250px;
      margin: auto;
  }
  </style>

</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Electronics EShop</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">About Us</a></li>
      <li><a href="#">Contact Us</a></li> 
      <li><a href="#">Login</a></li> 
      <li><a href="#">Register</a></li> 
    </ul>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
     <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="Images/mobile.jpg" alt="MOBILE" />
    </div>

    <div class="item">
      <img src="Images/digicam.jpg" alt="DIGICAM" />
    </div>

    <div class="item">
      <img src="Images/laptop.jpg" alt="LAPTOP"/>
    </div>

    <div class="item">
      <img src="Images/printer.jpg" alt="PRINTER"/>
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
<div  class="row">
<div class="col-sm-4"> <img  height="200px;" src="Images/mobile1.jpg" alt="MOBILE" /></div>
<div class="col-sm-4"> <img   height="200px;" src="Images/camera1.jpg" alt="MOBILE" /></div>
<div class="col-sm-4"> <img  height="200px;" src="Images/laptop1.jpg" alt="MOBILE" /></div>

</div>
<div>
</div>
<div style="text-align: center;">
	&copy; Copyright 2016-2017 
</div>


</body>
</html>