<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/3/2023
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Seach By name</title>
</head>
<body>
<h3>Products are:</h3>
<table>
    <c:forEach var="product" items="products">
    <tr>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
        <td>${product.getDescription()}</td>
        <td>${product.Brand()}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
