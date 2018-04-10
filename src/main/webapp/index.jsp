<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nowa strona główna</title>
</head>
<body>
	<h1>wstępny system do zarządzania autoryzacją</h1><br>
	<h5>zaloguj się aby przejść dalej</h5><br>
	<form method="POST" action="/login">
		<table>
			<tr>
				<td>login</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Imię</td>
				<td><input type="password" name="password"></td>
			</tr>

		</table>
		<br>
		<input type="submit" name="Zaloguj" value="submit"><br>
	</form>
	<a href="/registration.jsp">Rejestracja</a>
</body>
</html>