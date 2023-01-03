<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/3/2023
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--private int id;--%>
<%--private String name;--%>
<%--private double price;--%>
<%--private String description;--%>
<%--private String brand;--%>
<html>
<head>
    <title>Update Product</title>
</head>
<body>
<h3>Update Product</h3>
<p>
    <c:if test="${message != null}">
<h3>${message}</h3>
</c:if>
<p><a href="/products">Get Back to Product List</a></p>
</p>
<form action="/products?action=update" method="post">
    <table>
        <tr>
            <td>Id:</td>
            <td><input type="number" name="id" value="${product.getId()}"></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" value="${product.getName()}"></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="number" name="price" value="${product.getPrice()}"></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><input type="text" name="description" value="${product.getDescription()}"></td>
        </tr>
        <tr>
            <td>Brand:</td>
            <td><input type="text" name="brand" value="${product.getBrand()}"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Update</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
