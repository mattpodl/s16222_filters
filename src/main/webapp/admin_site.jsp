<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Strona nadawania uprawnien premium</title>
</head>
<body>
<form method="POST" action="/add_premium">
		<table>
			<tr>
				<td>login</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>premium</td>
				<td><input type="radio" name="premium" value="true" checked> premium<br></td>
  				<td><input type="radio" name="premium" value="false"> zwykle<br></td>
			</tr>

		</table>
		<br>
		<input type="submit" name="Zaloguj" value="submit"><br>
	</form>
</body>
</html>