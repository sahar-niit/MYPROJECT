<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
<script src="https://maps.googleapis.com/maps/api/js"></script> 

</head>
<body style="background-color: #FDFDFD;" >
<div class="container">
<%@ include file="header.jsp" %>
<div class="row">
<div class="col-sm-12">
  <div id="map" style="width:100%;height:300px"></div>
</div>
</div>
<script>
var mapCanvas = document.getElementById("map");
var mapOptions = {
    center: new google.maps.LatLng(18.9910643, 73.10484500000007), zoom: 15
}
var map = new google.maps.Map(mapCanvas, mapOptions);
</script>

<div class="row">
<div class="col-sm-4">
<h3>Address:</h3>
<p>JK Plaza,<br>Shivaji Chowk<br>Panvel<br>410210</p>
</div>
<div class="col-sm-4">
<h3>
Phone No:
</h3>
<p>9975710762</p>

</div>
<div class="col-sm-4">
<h3>
Write to us on:
</h3>
<a href="mailto:sahar027@gmail.com">sahar027@gmail.com</a>

</div>

</div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>