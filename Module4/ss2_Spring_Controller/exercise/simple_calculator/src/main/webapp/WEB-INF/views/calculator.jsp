<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2/1/2023
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/calculator/result">
    <input name="n1" type="number" size="20">
    <input name="n2" type="number" size="20"> <br> <br>
    <button name="submit" type="submit" value="1">Addition(+)</button>
    <button name="submit" type="submit" value="2">Subtraction(-)</button>
    <button name="submit" type="submit" value="3">Multiplication(x)</button>
    <button name="submit" type="submit" value="4">Division(/)</button>
</form>
<hr>
</body>
</html>
