<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>
</head>
<body style="background-color: #FDFDFD;">
<div class="container">
<%@ include file="header.jsp" %>
<div>
<form:form action="edit" modelAttribute="products" >
<table>
<tr>
<td>
<form:input path="id" style="visibility:hidden;" />
</td>
</tr>
	<tr>
	<td>
				<form:label path="name">
					<spring:message text="Name"></spring:message>
				</form:label>
	</td>
	<td>
				<form:input path="name"/>
	</td>
	</tr>
	<tr>
	<td>
				<form:label path="qty">
					<spring:message text="Quantity"></spring:message>
				</form:label>
	</td>
	<td>
				<form:input path="qty"/>
	</td>
	</tr>
	<tr>
	<td>
				<form:label path="price">
					<spring:message text="Price"></spring:message>
				</form:label>
	</td>
	<td>
				<form:input path="price"/>
	</td>
	</tr>
	<tr>
	<td>
				<form:label path="description">
					<spring:message text="Description"></spring:message>
				</form:label>
	</td>
	<td>
				<form:input path="description"/>
	</td>
	</tr>
	<tr>
	<td>
				<form:label path="category">
					<spring:message text="Category"></spring:message>
				</form:label>
	</td>
	<td>
				<form:input path="category"/>
	</td>
	</tr>
	<tr>
	<td>
				<form:label path="image">
					<spring:message text="Image Name"></spring:message>
				</form:label>
	</td>
	<td>
				<form:input path="image"/>
	</td>
	</tr>
	<tr>
	
	<td colspan="2">
				<input type="submit" value ='<spring:message text="Update Product" />' />
	</td>
	</tr>
</table>
</form:form>

</div>



<%@ include file="footer.jsp" %>
</div>
</body>
</html>