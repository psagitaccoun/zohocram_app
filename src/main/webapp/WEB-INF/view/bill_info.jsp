<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing information</title>
</head>
<h2>Billing information</h2>
<body>
First Name:${stored.firstName} </br>
Last Name:${stored.lastName}</br>
Product:${stored.product}</br>
Amount:${stored.amount}</br>
Email:${stored.email}</br>
Mobile:${stored.mobile}
</body>
</html>