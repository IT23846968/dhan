
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
</head>
<body>
    <h2>All Users</h2>
    <table border="1">
        <tr>
            <th>User ID</th>
            <th>User Name</th>
            <th>Email</th>
            <th>Password Hash</th>
            <th>Created Date</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${allUsers}">
            <tr>
                <td>${user.user_id}</td>
                <td>${user.user_name}</td>
                <td>${user.email}</td>
                <td>${user.password_hash}</td>
                <td>${user.created_date}</td>
                <td>
                    <a href="update.jsp?user_id=${user.user_id}&user_name=${user.user_name}&email=${user.email}&password_hash=${user.password_hash}&created_date=${user.created_date}">
                        <button>Update</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
