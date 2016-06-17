<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Us</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
  
</head>
<body style="background-color: #FDFDFD;" >
<div class="container">
<%@ include file="header.jsp" %>
<div class="row">
	<div class="col-sm-4"><a href="disp?prd=1" > 
	<img  height="200px;" src="<c:url value='/resources/Images/mobile1.jpg' />" alt="MOBILE" />
</a>

</div>
<div class="col-sm-4">
<a href="disp?prd=2" >
<img   height="200px;" src="<c:url value='/resources/Images/laptop1.jpg' />" alt="Laptop" />
</a>
</div>
<div class="col-sm-4"><a href="disp?prd=3" >
 <img  height="200px;" src="<c:url value='/resources/Images/camera1.jpg' />" alt="Camera" /> </a></div>


</div>
<div  style="background-color: lightgrey; font-family: forte; font-size:24px; ">
<center>
<p>
Our mission is to be a company that inspires and fulfills your curiosity.
</p>
<p>
Our unlimited passion for technology, content and services, 
and relentless pursuit of innovation, drives us to deliver 
ground-breaking new excitement and entertainment in ways that only Sony can.
Creating unique new cultures and experiences.
</p>
<p>
Everything we do, is to move you emotionally.
</p>
<p>
 Started in Panvel in 1946 from the sheer determination and hard work of two bright and enterprising young men. Both Masaru Ibuka and Akio Morita joined hands in making their dream of a successful global company a reality. Learn more about who we are and what we do in this section.
</p>
</center>
</div>
<%@ include file="footer.jsp" %>

</body>
</html>