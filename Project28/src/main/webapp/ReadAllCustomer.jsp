<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>
<%@ page import="com.utility.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Customers</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		request.setAttribute("list",new CustomerDao().getAllCustomer());
	%>
	<button><a href="Add.html">Add Customer</a></button>
	<table class="content-table">
	<thead>
	<tr>
		<th>Customer id</th>
		<th>Customer name</th>
		<th>Customer bill</th>
		<th>Customer phone</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="list" items="${requestScope.list }">
		<tr>
			<td><c:out value="${list.cid }"></c:out></td>
			<td><c:out value="${list.cname }"></c:out></td>
			<td><c:out value="${list.cbill }"></c:out></td>
			<td><c:out value="${list.cphone }"></c:out></td>
			<td><button><a href='DeleteCustomer?cid=<c:out value="${list.cid }"></c:out>'>Delete</a></button></td>
			<td><button><a href='Update.jsp?cid=<c:out value="${list.cid }"></c:out>'>Update</a></button>
		</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>