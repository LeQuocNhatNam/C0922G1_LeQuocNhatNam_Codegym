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
<p><a href="/products">Get back to product list</a></p>
<c:forEach var="product" items="${products}">
<fieldset>

    <legend>Product Information</legend>
    <table>

        <tr>
            <td>Name: </td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${product.getPrice()}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${product.getDescription()}</td>
        </tr>
        <tr>
            <td>Brand: </td>
            <td>${product.getBrand()}</td>
        </tr>
    </table>
</fieldset>
</c:forEach>

</body>
</html>
