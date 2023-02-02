<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2/2/2023
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h2>Settings</h2>
<form:form action="/setting" method="post" modelAttribute="setting">
    <input type="hidden" name="id" value="${id}">
    <table>
        <tr>
            <th>Languages</th>
            <td>
                <form:select path="languages" multiple="false">
                    <form:options items="${languages}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <th>Page Sizes</th>
            <td>Show
                <form:select path="pageSize">
                    <form:options items="${pageSizes}"></form:options>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <th>Spam filter</th>
            <td>
                <form:checkbox path="spamFilter" value="true"></form:checkbox> Enable spams filter
            </td>
        </tr>
        <tr>
            <th>Signature</th>
            <td>
                <form:textarea path="signature"></form:textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Update</form:button>
                <form:button><a style="text-decoration: none;color: black" href="/setting/list">Cancel</a></form:button></td>
        </tr>
    </table>
</form:form>

</body>
</html>
