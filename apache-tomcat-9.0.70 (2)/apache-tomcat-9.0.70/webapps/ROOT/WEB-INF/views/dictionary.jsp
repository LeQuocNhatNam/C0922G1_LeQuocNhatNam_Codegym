<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/31/2023
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/result" method="get">
    <input name="word" type="text" size="50" placeholder="please enter an English word"><br>
    <button type="submit">Search</button>
    <p style="color: blue; font-weight: bold">${meaning}</p>
</form>

</body>
</html>
