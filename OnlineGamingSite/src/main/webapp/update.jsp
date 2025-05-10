
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>
<body>
    <h2>Update Developer Details</h2>
    <form action="updateServlet" method="post">
        <input type="hidden" name="user_id" value="${param.user_id}">
        <table>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="user_name" value="${param.user_name}" required></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><input type="text" name="email" value="${param.email}" required></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input type="text" name="password_hash" value="${param.password_hash}" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Update"></td>
            </tr>
        </table>
    </form>
</body>
</html>
