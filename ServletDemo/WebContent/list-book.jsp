<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books List</title>
</head>
<body>
	<h1>Books List</h1>
	<table border="5">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>Edition</th>
			<th colspan="2">Action &nbsp;<a href="HomeController?action=addBook">Add</a></th>
		</tr>
		<c:forEach items="${books}" var="book" >
			<tr>
				<td><c:out value="${book.id}"></c:out></td>
				<td><c:out value="${book.name}"></c:out></td>
				<td><c:out value="${book.author}"></c:out></td>
				<td><c:out value="${book.edition}"></c:out></td>
				<td><a href="HomeController?action=editBook&id=<c:out value="${book.id}"/>">Update</a></td>
                <td><a href="HomeController?action=deleteBook&id=<c:out value="${book.id}"/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>