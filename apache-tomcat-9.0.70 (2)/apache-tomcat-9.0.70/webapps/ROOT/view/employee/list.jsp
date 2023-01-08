<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/7/2023
  Time: 7:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>service</title>
    <link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.css">
    <style>
        a {
            color: white;
        }
        .a-create {
            color: blue;
        }
        table {
            text-align: center;
        }
        #a-edit {
            color: blue;
        }
    </style>
</head>

<body>
<center>
    <h2>Employee List</h2>
</center>
<button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
    Add New Employee
</button>
<a class="a-create" href="/home">Back to Home</a>
<table class="table table-striped">
    <tr>
        <th>#</th>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>ID Card</th>
        <th>Salary</th>
        <th>Phone Number</th>
        <th>Email</th>
        <th>Address</th>
        <th>Position ID</th>
        <th>Education Degree ID</th>
        <th>Division</th>
        <th>User Name</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
<%--    <c:forEach var="customer" items="customerList" varStatus="status">--%>
    <tr>
        <td>1</td>
        <td>1</td>
        <td>Nguyen Van A</td>
        <td>07/04/1994</td>
        <td>197325834</td>
        <td>2000</td>
        <td>0989771010</td>
        <td>namle@gmail.com</td>
        <td>160 Ho Tung Mau</td>
        <td>3</td>
        <td>2</td>
        <td>3</td>
        <td>nam123</td>
        <td>
            <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Edit
            </button>
        </td>
        <td>
            <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
        </td>
    </tr>
<%--    </c:forEach>--%>
</table>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>
</html>
