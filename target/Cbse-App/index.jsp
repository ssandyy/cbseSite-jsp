<%@ page import="java.sql.Connection" %>
<%@ page import="com.DB.DbConnect" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
</head>

<body class="loginbody">
	<%@ include file="all_component/navbar.jsp"%>
	<div class="logincustom">
		<!-- partial:index.partial.html -->
		<div id="logo">
			<h1>
				<i>Welcome To Ssandyy Projects</i>
			</h1>
		</div>
		<section class="stark-login">

			<form action="home.jsp" method="post">
				<div id="fade-box">
					<input type="text" name="name" id="username" placeholder="Username"
						required> <input type="password" name="pass"
						placeholder="Password" required>
					
					<button>Log In</button>
				</div>
			</form>
			 
			<% Connection conn = DbConnect.getConn();
				out.println(conn);
			%>
			<div class="hexagons">
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<br> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<br> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <br> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <br> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span>
			</div>
		</section>

		<div id="circle1">
			<div id="inner-cirlce1">
				<h2></h2>
			</div>
		</div>
	</div>
	<!--  <ul>
              <li></li>
              <li></li>
              <li></li>
              <li></li>
              <li></li>
            </ul> -->
	<!-- partial -->

</body>
</html>