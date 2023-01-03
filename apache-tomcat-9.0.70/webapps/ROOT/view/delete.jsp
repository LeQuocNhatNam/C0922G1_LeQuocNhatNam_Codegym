<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/3/2023
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h3>
    Are you sure to delete this customer?
</h3>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>name: </td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>price: </td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${product.getDescription()}</td>
            </tr>
            <tr>
                <td>brand</td>
                <td>${product.getBrand()}</td>
            </tr>
            <tr>
                <td><button type="submit">Delete</button></td>
                <td><a href="/products">Back to Product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
