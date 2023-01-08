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
    <h2>Customer List</h2>
</center>
<h6><a class="a-create" href="/customer?action=create">Add New Customer</a></h6>
<a class="a-create" href="/home">Back to Home</a>
<table class="table table-striped">
    <tr>
        <th>#</th>
        <th>Customer ID</th>
        <th>Customer Type</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>ID Card</th>
        <th>Phone Number</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="customer" items="${customerList}" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${customer.id}</td>
        <td>${customer.customerType.name}</td>
        <td>${customer.name}</td>
        <td>${customer.dateOfBrith}</td>
        <td>
        <c:if test="${customer.gender}">
            <c:out value="Male"/>
        </c:if>
        <c:if test="${!customer.gender}">
            <c:out value="Female"/>
        </c:if>
        </td>
        <td>${customer.idCard}</td>
        <td>${customer.phoneNumber}</td>
        <td>${customer.email}</td>
        <td>${customer.address}</td>
        <td><a id="a-edit" href="/customer?action=edit$id=${customer.id}">Edit</a></td>
        <td>
            <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
        </td>
    </tr>
    </c:forEach>
</table>
<%--Modal--%>
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
