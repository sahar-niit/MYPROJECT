<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<nav class="navbar navbar-inverse">
	<div style="color: white;" class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Sahar Electronics</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="/ElectronicsStore">Home</a></li>
			<li><a href="about">About Us</a></li>
			<li><a href="contact">Contact Us</a></li>
			<li><a href="disp?id=4">View All</a></li>

			<sec:authorize access="hasRole('ROLE_ADMIN')">

				<li><a href="add">Add Product</a></li>
			</sec:authorize>
		</ul>

		<ul class="nav navbar-nav navbar-right">

			<sec:authorize access="isAnonymous()">
				<li><a href="login"><span
						class="glyphicon glyphicon-hand-right"></span>View Cart</a></li>
				<li><a href="register"><span
						class="glyphicon glyphicon-user"></span>Register</a></li>
				<li><a href="login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
				<li><span class="glyphicon"></span>Welcome <%= request.getUserPrincipal().getName() %>
				</li>
				<sec:authorize access="hasRole('ROLE_USER')">
				<li><a href="<c:url value='/memberShip'/>"><span
						class="glyphicon glyphicon-hand-right"></span>View Cart</a></li>
						</sec:authorize>
				<li><a href='<c:url value="/j_spring_security_logout" />'>
						<span class="glyphicon glyphicon-log-out"></span> Logout
				</a></li>
			</sec:authorize>
		</ul>
	</div>
</nav>