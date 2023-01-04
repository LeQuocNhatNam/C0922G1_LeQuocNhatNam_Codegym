<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/3/2023
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%--private int id;--%>
<%--private String name;--%>
<%--private double price;--%>
<%--private String description;--%>
<%--private String brand;--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h2>Product list</h2>
<h4><a href="/products?action=create">Create new Product</a></h4>
<form action="/products?action=searchByName" method="post">
    <p><input type="text" name="nameSearch" placeholder="enter name"><br>
        <button type="submit">Search</button>
    </p>
</form>
<table style="border: solid black 1px">
    <tr>
        <th>No.</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Brand</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="product" items="${products}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getBrand()}</td>
            <td><a href="/products?action=update&id=${product.getId()}">Update</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
