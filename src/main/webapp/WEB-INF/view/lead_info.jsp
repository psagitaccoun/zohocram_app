<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details of lead</title>
</head>
<h2>Lead Information</h2>
<body>
<table>


<tr>
<td>FirstName</td>
<td><input type="text" name="firstName" value="${stored.firstName}"></td>
</tr>

<tr>
<td>LastName</td>
<td><input type="text" name="lastName" value="${stored.lastName}"></td>
</tr>

<tr>
<td>Source</td>
<td><input type="text" name="source" value="${stored.source}"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" value="${stored.email}"></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="number" name="mobile" value="${stored.mobile}"></td>
</tr>

<tr>
<form action="deleteLead" method="post"> 
<td><input type="hidden" name="id" value="${stored.id}"></td>
<td><input type="submit" value="delete" ></td>
</form>

<form action="update" method="post"> 
<td><input type="hidden" name="id" value="${stored.id}"></td>
<td><input type="submit" value="edit" ></td>
</form>

<form action="convertLead" method="post"> 
<td><input type="hidden" name="id" value="${stored.id}"></td>
<td><input type="submit" value="convert" ></td>
</form>
</tr>

</table>

</body>
</html>