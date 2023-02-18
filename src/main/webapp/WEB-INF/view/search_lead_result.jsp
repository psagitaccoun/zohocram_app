<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>

<h2>All Lead Details</h2>

<table  border="1"  width="500">
<tr>
<td>FirstName</td>
<td>LastName</td>
<td>Source</td>
<td>Email</td>
<td>Mobile</td>
<td>Details</td>
<td>Delete</td>
<td>Update</td>
</tr>
</table>
 <c:forEach var="lead" items="${lead}">
 <table  border="1"  width="500">
<tr>

<td><a href="info?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.source}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
<td><a href="deleteLead?id=${lead.id}">Delete</a></td>
<td><a href="update?id=${lead.id}">Update</a></td>
</tr>
</table>
   </c:forEach>

</body>
</html>