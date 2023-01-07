<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/6/2023
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Create Student's information</title>
    <style>
        p {
            color: blue;
        }
    </style>
</head>
<body>
<a href="/student">Back to Student List</a>
<p>${message}</p>
<form action="/student" method="post">
    <input type="text" name="action" value="create" hidden>
    <input oninput="checkName(this.value)" type="text" name="name" placeholder="enter name">
    <span id="errorName"></span>
    <br>
    <input type="radio" name="gender" value="true"> Male
    <input type="radio" name="gender" value="false"> Female <br>
    <input type="number" name="point" required placeholder="enter point"><br>
    <select name="classId">
        <option value="0">select</option>

        <c:forEach var="class" items="${classList}">
            <option value="${class.id}">${class.name}</option>
        </c:forEach>
    </select> <br>
    <button disabled type="submit" id="btnSave">Save</button>
</form>
</body>
<script>
    function checkName(name) {
        let regName = /^[A-Z][a-z]*(\s[A-Z][a-z]*)+$/;
        let checkedName = regName.exec(name);
        if (!checkedName) {
            document.getElementById("errorName").innerText = "invalid name!";
            document.getElementById("btnSave").disabled = true;
        } else {
            document.getElementById("errorName").innerText = "OK!";
            document.getElementById("btnSave").disabled = false;
        }
    }

</script>
</html>
