<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2/1/2023
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/sandwich/chosen" method="get">
    <input name="condiment" type="checkbox" value="Lettuce"> Lettuce
    <input name="condiment" type="checkbox" value="Tomato"> Tomato
    <input name="condiment" type="checkbox" value="Mustard"> Mustard
    <input name="condiment" type="checkbox" value="Sprouts"> Sprouts
    <hr>
    <button type="submit">Save</button>
</form>
</body>
</html>
