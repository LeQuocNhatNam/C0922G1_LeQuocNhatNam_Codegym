<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/4/2023
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add new User</a>
    </h2>
    <h2>Search By Country
        <form action="/users?action=searchByCountry" method="post">
            <input type="text" name="country" size="30">
            <button type="submit">Search</button>
        </form>
    </h2>
    <h2 style="color: green">Search By Name
        <form action="/users?action=searchByName" method="post">
            <input type="text" name="name" size="30">
            <button type="submit">Search</button>
        </form>
    </h2>
    <h2>
        <form action="/users" method="get">
            <input type="text" name="action" value="sort" hidden>
            <button type="submit">Sort By Name</button>
        </form>
    </h2>
    <h3>
        <c:if test="${message!=null}">
            ${message}
        </c:if>
    </h3>

</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>No.</th>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${userList}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
