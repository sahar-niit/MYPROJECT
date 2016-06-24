<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping Address</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="<c:url value='/resources/js/AngularjsController.js'/>"></script>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>

				<form:form modelAttribute="ship" class="form-horizaontal">
				 
                   <div class="span9 center margin-bottom"> 
					<h3>Shipping Details</h3>
					</div>
					  
					  <div class="form-group">
						<label class="control-label">House Number</label>
						  <form:input path="houseNumber" id="houseNumber" class="form-Control"/>
						
					  </div>
					  <div class="form-group">
						<label class="control-label">Address Line 1</label>
						
						 <form:input path="addressLine1" id="addressLine1" class="form-Control"/>
						
					  </div>
						<div class="form-group">
						<label class="control-label">Address Line 2</label>
						
						 <form:input path="addressLine2" id="addressLine2" class="form-Control"/>
						
						</div>
						
						
						<div class="form-group">
						<label class="control-label">City</label>
						
						  <form:input path="city" id="city" class="form-Control"/>
						</div>
					  
					  <div class="form-group">
						<label class="control-label">State</label>
						
						  <form:input path="state" id="state" class="form-Control"/>
						</div>
					  					  
					  <div class="form-group">
						<label class="control-label">Country</label>
						
							<form:input path="country" id="country" class="form-Control"/>
						
					  </div>
					  <div class="form-group">
						<label class="control-label">Zipcode</label>
						
							<form:input path="zipCode" id="zipCode" class="form-Control"/>
						</div>
					  
					  <div class="row">
					  <div class="col-sm-4">
					 	 <button class="btn btn-primary" name="_eventId_back">Back</button>
					    </div>
					  <div class="col-sm-4">
					  <input type="hidden" name="_flowExecutionKey" />
						<input type="submit" value="Proceed to Payment" class="btn btn-primary" name="_eventId_payment" />
						 </div>
						 <div class="col-sm-4">
					 	<button class="btn btn-danger" name="_eventId_cancel">Cancel</button>
					    </div>
					  </div>
					    </form:form>
					    
<%@ include file="footer.jsp" %>
</div>

</body>
</html>