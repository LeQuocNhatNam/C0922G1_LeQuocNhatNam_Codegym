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

    </style>
</head>
<body>
<center>
    <h3>Add New House</h3>
</center>
<form method="post">
    <input type="hidden" value="villa" name="name">
    <center>
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="number" size="20" name="id"></td>
        </tr>
        <tr>
            <td>Area:</td>
            <td>
                <input type="number" size="20" name="area">
            </td>
        </tr>
        <tr>
            <td>Cost:</td>
            <td>
                <input type="number" size="20" name="cost">
            </td>
        </tr>
        <tr>
            <td>Max People</td>
            <td>
                <input type="number" size="20" name="maxPeople">
            </td>
        </tr>
        <tr>
            <td>Rental Type:</td>
            <td>
                <select name="rentalType">
                    <option value="year">year</option>
                    <option value="month">month</option>
                    <option value="day">day</option>
                    <option value="hour">hour</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Standard Room</td>
            <td>
                <input type="text" size="20" name="standardRoom">
            </td>
        </tr>
        <tr>
            <td>Other Convenience Description</td>
            <td>
                <input type="text" size="20" name="otherConvenienceDescription">
            </td>
        </tr>
        <tr>
            <td>Number of Floors</td>
            <td>
                <input type="number" size="20" name="numberOfFloors">
            </td>
        </tr>
    </table>
    </center>
</form>


</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>

</html>
