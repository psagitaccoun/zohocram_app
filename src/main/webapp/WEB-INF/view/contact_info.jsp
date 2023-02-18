<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Details</title>
</head>
<h2>Contact Details</h2>
<body>
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstName" value="${stored.firstName }"></td>
</tr>

<tr>
<td>LastName</td>
<td><input type="text" name="LastName" value="${stored.lastName }"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" value="${stored.email }"></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" value="${stored.mobile }"></td>
</tr>


</table>

</body>
</html>