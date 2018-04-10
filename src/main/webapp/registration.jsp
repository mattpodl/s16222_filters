<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Konferencja</title>
</head>
<body>
	<form method="POST" action="/add">
		<h2>Logowanie na konferencje</h2>
		<table>
			<tr>
				<td>username</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>e-mail</td>
				<td><input type="text" name="mail"></td>
			</tr>
			<tr>
				<td>haslo</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>potwierdz haslo</td>
				<td><input type="password" name="password_confirmation"></td>
			</tr>
			</table>
	<br>
		<input type="submit" name="Zaloguj" value="submit"><br>
		</form>

	<a href="/login.jsp">strona logowania</a>
</body>
</html>