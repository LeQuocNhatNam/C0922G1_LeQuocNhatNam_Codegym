<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/3/2023
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting customers</title>
</head>
<body>
<h1>Delete Customer</h1>
<p><a href="/customers">Back to customer list</a></p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>
                    ${requestScope["customer"].getName()}
                </td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>
                    ${requestScope["customer"].getEmail()}
                </td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>
                    ${requestScope["customer"].getAddress()}
                </td>
            </tr>
            <tr>
                <td><button type="submit">Delete Customer</button></td>
                <td><a href="/customers">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
