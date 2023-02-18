<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>

<h2>Update the Lead</h2>
<form action="updateLead" method="post">
<body>

<table>
<tr>
<td><input type="hidden" name="id" value="${stored.id }"></td>
</tr>

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

<td><input type="submit" value="update"></td>

</tr>




</table>

</body>
</form>
</html>