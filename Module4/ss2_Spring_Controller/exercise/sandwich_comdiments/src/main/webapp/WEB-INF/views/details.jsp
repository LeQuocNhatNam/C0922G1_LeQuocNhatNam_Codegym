<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2/1/2023
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
<h3>You have chosen:
<c:forEach var="condiment" items="${condiments}">
    <p style="color: red">${condiment}</p>
</c:forEach>
</h3>
</body>
</html>
