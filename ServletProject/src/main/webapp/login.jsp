<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="login" method="post" action="/ServletProject/LoginServlet">
<center>
	<div>
		<h2>Welcome to Login</h2>
	</div>
	
<table>
		<tr>
			<td>User name</td>
			<td><input type="text" name="t1" ></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="t2" ></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="login" ></td>
			<td><input type="reset" value="reset" ></td>
		</tr>
		
		
</table>

</center>
</form>
</body>

</html>