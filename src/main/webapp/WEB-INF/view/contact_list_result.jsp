<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Contacts</title>
</head>
<h2>List of Contacts</h2>
<body>
<table  border="1"  width="500">
<tr>
<td>FirstName</td>
<td>LastName</td>
<td>Email</td>
<td>Mobile</td>
<td>GenerateBill</td>
</tr>
</table>

 <c:forEach var="stored" items="${contacts}">
<table  border="1"  width="500">
<tr>
<td><a href="contactInfo?id=${stored.id}">${stored.firstName }</a></td>
<td>${stored.lastName }</td>
<td>${stored.email}</td>
<td>${stored.mobile }</td>
<td><a href="generatebill?id=${stored.id}">generatebill</a></a></td>
</tr>
</table>

        </c:forEach>
</body>
</html>