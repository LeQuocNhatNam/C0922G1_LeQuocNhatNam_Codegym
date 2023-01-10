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
    <h3>Add New Villa</h3>
</center>
<h3 style="color: blue">${message}</h3>
<h6><a href="/facility">Back to Facility List</a></h6>
<form action="/facility?action=createVilla" method="post">
    <center>
        <input type="hidden" value="1" name="facilityTypeId">
    <table>
        <tr>
            <td>Facility Type: </td>
            <td>
                    <input disabled type="text" value="Villa" name="facilityType">
            </td>
        </tr>
        <tr>
            <td>Facility Name: </td>
            <td>
                <input type="text" size="20" name="name" value="Villa " required>
            </td>
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
                <select name="rentTypeId">
                    <option value="">Select Rental Type</option>
                    <c:forEach var="rentType" items="${rentTypeList}">
                    <option value="${rentType.id}">${rentType.name}</option>
                    </c:forEach>
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
                <input type="text" name="otherConvenience">
            </td>
        </tr>
        <tr>
            <td>Pool Area</td>
            <td>
                <input type="number" size="20" name="poolArea">
            </td>
        </tr>
        <tr>
            <td>Number of Floors</td>
            <td>
                <input type="number" size="20" name="numberOfFloors">
            </td>
        </tr>
        <tr>
            <td>Free Facility</td>
            <td>
                <input type="text" name="freeFacility">
            </td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Save</button></td>
        </tr>
    </table>
    </center>
</form>


</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>

</html>
