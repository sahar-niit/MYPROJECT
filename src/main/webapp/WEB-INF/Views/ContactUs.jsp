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
<body>
<div class="container">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Electronics EShop</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="/Product">Home</a></li>
      <li><a href="About">About Us</a></li>
      <li class="active"><a href="Contact">Contact Us</a></li> 
      <li><a data-toggle="modal" data-target="#myModal">Login</a></li> 
      <li><a href="Register">Register</a></li> 
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
  <div id="map" style="width:400px;height:300px"></div>

<script>
var mapCanvas = document.getElementById("map");
var mapOptions = {
    center: new google.maps.LatLng(18.9910643, 73.10484500000007), zoom: 20
}
var map = new google.maps.Map(mapCanvas, mapOptions);
</script>

<div class="row">
<div class="col-sm-6">
<h3>Address:</h3>
<p>JK Plaza,<br>Shivaji Chowk<br>Panvel<br>410210</p>
</div>
<div class="col-sm-6">
<h3>
Phone No:
</h3>
<p>9975710762</p>

</div>

</div>

</div>
</body>
</html>