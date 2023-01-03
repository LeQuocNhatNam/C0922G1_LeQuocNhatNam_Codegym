<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/3/2023
  Time: 2:54 PM
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
    <title>Creating</title>
</head>
<body>
<h3>Enter Product Information</h3>
<p>
    <c:if test="${message!=null}">
<h3>${message}</h3>
</c:if>
</p>
<p><a href="/products">Back to Product list</a></p>
<form action="/products?action=create" method="post">
    <input type="number" name="id" placeholder="enter id"> <br>
    <input type="text" name="name" placeholder="enter name"> <br>
    <input type="number" name="price" placeholder="enter price"> <br>
    <input type="text" name="description" placeholder="enter Description"> <br>
    <input type="text" name="brand" placeholder="enter brand"> <br>
    <button type="submit">Create</button>
</form>
</body>
</html>
