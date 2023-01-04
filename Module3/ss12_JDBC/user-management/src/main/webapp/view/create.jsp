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
        <h2>
            <a href="users?action=users">List All Users</a>
        </h2>
    </h2>
    <h3 style="color: blue">
        <c:if test="${message!=null}">
            ${message}
        </c:if>
    </h3>
</center>
<div align="center">
    <form method="post">
        <table border="1">
            <caption>
                <h2>Add New User</h2>
            </caption>
            <tr>
                <th>User Name</th>
                <td>
                    <input type="text" name="name" size="45">
                </td>
            </tr>
            <tr>
                <th>User Email</th>
                <td>
                    <input type="text" name="email" size="45">
                </td>
            </tr>
            <tr>
                <th>User Country</th>
                <td>
                    <input type="text" name="country" size="15">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button type="submit">Save</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
