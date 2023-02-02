<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2/2/2023
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>
            No.
        </th>
        <th>
            Email
        </th>
        <th>
            Setting
        </th>
    </tr>
    <c:forEach var="email" items="${emailList}" varStatus="status">
        <tr>
            <td>${email.id}</td>
            <td>${email.email}</td>
            <td>
                <button><a style="text-decoration: none" href="/setting?id=${email.id}">Setting</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
