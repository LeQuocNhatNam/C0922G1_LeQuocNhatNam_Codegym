<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/7/2023
  Time: 8:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Add new service</title>
    <link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.css">
    <style>
        h5{
            color: blue;
        }
    </style>
</head>
<body>
<center>
    <h3>Add New Customer</h3>
</center>
<form method="post">
    <center>
        <table>
            <tr>
                <td><a href="/customer">Back to Customer List</a></td>
            </tr>
            <tr>
                <td>Customer type</td>
                <td>
                    <select name="customerTypeId">
                        <option value="">select customer type</option>
                        <c:forEach var="customerType" items="${customerTypeList}">
                            <option value="${customerType.id}">${customerType.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>
                    <input type="text" size="20" name="name">
                </td>
            </tr>
            <tr>
                <td>Date Of Birth</td>
                <td>
                    <input type="date" size="20" name="dateOfBirth" required>
                </td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" name="gender" value="true">Male
                    <input type="radio" name="gender" value="false">Female
                </td>
            </tr>
            <tr>
                <td>ID card:</td>
                <td>
                    <input type="text" size="20" name="idCard">
                </td>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td>
                    <input type="text" size="20" name="phoneNumber">
                </td>
            </tr>
            <tr>
                <td>email</td>
                <td>
                    <input type="text" size="20" name="email">
                </td>
            </tr>
            <tr>
                <td>address</td>
                <td>
                    <input type="text" size="20" name="address">
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit">Save</button>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><h5>${message}</h5></td>
            </tr>
        </table>
    </center>
</form>


</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>

</html>
