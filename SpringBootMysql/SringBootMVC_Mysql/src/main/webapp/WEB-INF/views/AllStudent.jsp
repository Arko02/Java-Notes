<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="MenuPage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>All Students</h1>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Password</td>
			<td>Delete</td>
			<td>Update</td>
		</tr>
		<c:forEach var="All" items="${Students}">
			<tr>
				<td>${All.id}</td>
				<td>${All.name}</td>
				<td>${All.email}</td>
				<td>${All.mobile}</td>
				<td>${All.password}</td>
				<td><a href="Delete?id=${All.id}">Delete</a></td>
				<td><a href="GetTheDetail?id=${All.id}">Update</a></td>
				<!-- GetTheDetail?id=${All.id} <-> Query Parameter's Data can be read by @RequestParam Annotation  -->
			</tr>
		</c:forEach>
	</table>

</body>
</html>