<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About US</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<div>
<img width="100%" height="250px" src="<c:url value='/resources/Images/iphoneblack.jpg' />" />
</div>
<div class="row">
<div class="col-sm-3">
<img width="100%" height="250px"  src="<c:url value='/resources/Images/camera.jpg' />" />
</div>
<div class="col-sm-6" style="background-color: black; height:250px; color:white; font-family: Arial; font-size: 24px;">
Its part of Meast E-Commerce Trading LLC.
It is the regions Premier online shopping portal for quality consumer goods, 
ranging from mobile phones, laptops, and cameras, 
established in 2008, with its headquarters in Panvel.
</div>
<div class="col-sm-3">
<img width="100%" height="250px" src="<c:url value='/resources/Images/laptop.jpg' />" />
</div>
</div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>