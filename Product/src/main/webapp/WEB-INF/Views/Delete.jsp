<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Deletion</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
</head>
<body style="background-color: #FDFDFD;">
<div class="container">
<%@ include file="header.jsp" %>
<div>
<h3>Are you sure you want to Delete?</h3>
<form action="delete" method="post">
<input type="text" name="id" style="visibility:hidden;" value="${param.id }"/>
<input type="submit" value="Delete"/>
</form>
<form action="disp" method="get">
<input type="submit" value="Cancel"/>
</form>

</div>




<%@ include file="footer.jsp" %>
</div>
</body>
</html>