<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
	<form action="SaveServlet" method=post>
	Enter showroom name:
	<input type="text" name="showroomName">
	<br>
	<br> Enter showroom dealsWith:
	<input type="text" name="dealsWith">
	<br>
	<br> Enter showroom location:
	<input type="text" name="location">
	<br>
	<br>
	<input type="submit" value="submit">
	<br>
	<input type="reset" value="reset">
	<br>
</form>
</body>
</html>