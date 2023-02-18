<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing list</title>
</head>
<h2>List of Billings</h2>
<body>
<table  border="1"  width="500">
<tr>
<td>FirstName</td>
<td>LastName</td>
<td>Product</td>
<td>Amount</td>
<td>Email</td>
<td>Mobile</td>
</tr>
</table>


 <c:forEach var="stored" items="${stored}">
<table  border="1"  width="500">
<tr>
<td><a href="billInfo?id=${stored.id}">${stored.firstName }</a></td>
<td>${stored.lastName }</td>
<td>${stored.product }</td>
<td>${stored.amount }</td>
<td>${stored.email}</td>
<td>${stored.mobile }</td>
</tr>
</table>

        </c:forEach>

</body>
</html>