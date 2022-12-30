<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 12/30/2022
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
    <c:if test="${exception == 1}">
        <h2>there is exception!!!</h2>
    </c:if>

    <c:if test="${exception == 0}">
        <h2>result is ${result}</h2>
    </c:if>

</body>
</html>
