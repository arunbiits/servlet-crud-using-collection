<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Books here....</h1>
	<form action="HomeController?action=editBook" method="POST">
		<input type="hidden" name="id" value="${book.id}">
		<table>
			<tr>
				<td>Book Name</td>
				<td><input type="text" name="name" value="${book.name}" /></td>
			</tr>
			<tr>
				<td>Book Author</td>
				<td><input type="text" name="author" value="${book.author}" /></td>
			</tr>
			<tr>
				<td>Book Edition</td>
				<td><input type="text" name="edition" value="${book.edition}" /></td>
			</tr>
			<tr>
				<td><a href="HomeController?action=listBook"><button>Cancel</button></a></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>
</body>
</html>