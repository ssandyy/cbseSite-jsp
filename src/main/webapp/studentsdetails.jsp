<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp" %>
</head>
<body>
<%@ include file="all_component/navbar.jsp"%>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="all_component/images/profile-icon-images-25.jpg" alt="Avatar" style="width:300px;height:300px;">
    </div>
    <div class="flip-card-back">
      <!-- <h1>John Doe</h1>
      <p>Architect & Engineer</p>
      <p>We love that guy</p> -->
      <c:forEach var="student" items="${std}">
        <div style="border: 1px solid #ccc; padding: 10px; margin: 10px; width: 300px;">
            <p>Name: ${std.fname}</p>
            <p>Department: ${std.lname}</p>
            <p>Department: ${std.age}</p>
            <!-- Other details... -->
        </div>
    </c:forEach>
    </div>
  </div>
</div>
<%@ include file="all_component/footer.jsp"%>
</body>
</html>