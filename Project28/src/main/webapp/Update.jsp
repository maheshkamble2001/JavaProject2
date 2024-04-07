<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		request.setAttribute("cid",Integer.parseInt(request.getParameter("cid")));
	%>
	<form action="UpdateCustomer" method="post">
		<label>Customer id : </label><br>
		<input type="text" name="cid" placeholder="Enter customer id" value="${requestScope.cid }"><br><br>
		
		<label>Customer name : </label><br>
		<input type="text" name="cname" placeholder="Enter customer name"><br><br>
		
		<label>Bill :</label><br>
		<input type = "text" name="cbill" placeholder= "Enter customer bill"><br><br>
		
		<label>Customer phone number : </label><br>
		<input type="tel" name="cphone" placeholder="Enter customer phone number"><br><br>
		
		<button type="submit">Submit</button>
	</form>
</body>
</html>