<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Books here....</h1>
	<form action="HomeController?action=addBook" method="POST">
		<table>
			<tr>
				<td>Book Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Book Author</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td>Book Edition</td>
				<td><input type="text" name="edition" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>