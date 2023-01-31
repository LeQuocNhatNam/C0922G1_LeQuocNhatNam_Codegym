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

</center>
<h3 style="color: blue"></h3>
<h6><a href="/bookCard">Back to Book Borrow List</a></h6>
<center>
<h6>${message}</h6>
</center>
<form method="post">
    <center>
        <%--        <select onchange="displayChoice();" name="facilityTypeId" id="choice">--%>
        <%--            <option  value="">Select Facility Type</option>--%>
        <%--            <c:forEach var="facilityType" items="${facilityTypeList}">--%>
        <%--                <option value="${facilityType.id}">${facilityType.name}</option>--%>
        <%--            </c:forEach>--%>
        <%--        </select>--%>
        <%--        <input type="hidden" value="1" name="facilityTypeId">--%>
        <table>

            <tr>
                <td>BookBorrow ID:</td>
                <td>
                    <input type="text" name="bookBorrowId" value="MS-" required/>
                    <%--                    <input id="facility-name" type="text" size="20" name="name" required> <span id="facility-name-validate"></span>--%>
                </td>
            </tr>
            <tr>
                <td>Book Name:</td>
                <td>
                    <input type="text" name="bookName" disabled value="${bookName}">
                    <input type="number" hidden name="bookId" value="${bookId}">
                    <%--                    <input id="facility-name" type="text" size="20" name="name" required> <span id="facility-name-validate"></span>--%>
                </td>
            </tr>
            <tr>
                <td>Student name:</td>

                <td>
                    <select name="studentId" id="">
                        <c:forEach var="student" items="${studentList}">
                            <option value="${student.id}">${student.name}</option>
                        </c:forEach>
                    </select>
                </td>

            </tr>
            <tr>
                <td>Borrow Date:</td>
                <td>
                    <input type="date" size="20" name="borrowDate">
                </td>
            </tr>
            <tr>
                <td>Return Date</td>
                <td>
                    <input type="date" size="20" name="returnDate">
                </td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button class="btn btn-primary" id="btn-borrow" type="submit">Borrow</button>
                    <button class="btn btn-danger" id="btn-cancel" type="submit">Cancel</button>
                </td>
            </tr>
        </table>
    </center>
</form>


</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>
<script>

</script>
</html>
