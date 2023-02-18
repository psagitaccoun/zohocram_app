<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<h2>Billing details of Contacts</h2>
<body>
<form action="saveBill" method="post">
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstName" value="${stored.firstName }"></td>
</tr>

<tr>
<td>LastName</td>
<td><input type="text" name="lastName" value="${stored.lastName }"></td>
</tr>

<tr>
<td>Product</td>
<td><input type="text" name="product" ></td>
</tr>

<tr>
<td>Amount</td>
<td><input type="number" name="amount" ></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" value="${stored.email }"></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" value="${stored.mobile }"></td>
</tr>

<tr>
<td><input type="submit"  value="generateBill"></td>
</tr>

</table>
</form>
</body>
</html>