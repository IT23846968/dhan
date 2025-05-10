<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Developer Details</h2>
	<form action="InsertServlet" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="user_name" required></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" required></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password_hash" required></td>
			</tr>	
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>		
		</table>
	</form>


</body>
</html>