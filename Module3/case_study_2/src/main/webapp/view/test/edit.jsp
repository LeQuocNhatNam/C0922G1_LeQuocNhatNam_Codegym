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
    <title>Edit Facility</title>
    <link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.css">
    <style>

    </style>
</head>
<body>
<center>
    <h3>Edit Facility</h3>
</center>
<h3 style="color: blue">${message}</h3>
<h6><a href="/employee">Back to Facility List</a></h6>
<form method="post">
    <center>
        <%--        <input type="hidden" value="${facility.facilityType.id}" name="facilityTypeId">--%>
        <table>
            <%--            <tr>--%>
            <%--                <td>Facility Type: </td>--%>
            <%--                <td>--%>
            <%--                    <input disabled type="text" value="${facility.facilityType.name}" name="facilityType">--%>
            <%--                </td>--%>
            <%--            </tr>--%>
            <tr>
                <td>Facility Name: </td>
                <td>
                    <input type="text" size="20" name="name" value="${facility.name} " required>
                </td>
            </tr>
            <tr>
                <td>Area:</td>
                <td>
                    <input type="number" size="20" name="area" value="${facility.area}">
                </td>
            </tr>
            <tr>
                <td>Cost:</td>
                <td>
                    <input type="number" size="20" name="cost" value="${facility.cost}" >
                </td>
            </tr>
            <tr>
                <td>Max People</td>
                <td>
                    <input type="number" size="20" name="maxPeople" value="${facility.maxPeople}">
                </td>
            </tr>
            <tr>
                <td>Rental Type:</td>
                <td>
                    <select name="rentTypeId">
                        <option value="${facility.rentType.id}">${facility.rentType.name}</option>
                        <c:forEach var="rentType" items="${rentTypeList}">
                            <option value="${rentType.id}">${rentType.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Standard Room</td>
                <td>
                    <input <c:if test="${facility.facilityType.id == 3}">disabled </c:if>
                           type="text" size="20" name="standardRoom" value="${facility.standardRoom}">
                </td>
            </tr>
            <tr>
                <td>Other Convenience Description</td>
                <td>
                    <input <c:if test="${facility.facilityType.id == 3}">disabled </c:if>
                           type="text" name="otherConvenience" value="${facility.otherConvenience}">
                </td>
            </tr>
            <tr>
                <td>Pool Area</td>
                <td>
                    <input  <c:if test="${facility.facilityType.id == 3}">disabled </c:if>
                            type="number" size="20" name="poolArea" value="${facility.poolArea}">
                </td>
            </tr>
            <tr>
                <td>Number of Floors</td>
                <td>
                    <input <c:if test="${facility.facilityType.id == 3}">disabled </c:if>
                           type="number" size="20" name="numberOfFloors" value="${facility.numberOfFloors}">
                </td>
            </tr>
            <tr>
                <td>Free Facility</td>
                <td>
                    <input <c:if test="${facility.facilityType.id == 2}">disabled </c:if>
                           type="text" name="freeFacility"
                           value="${facility.freeFacility}">
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
