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
    <link rel="stylesheet" href="/bootstrap520/css/bootstrap.min.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap5.min.css">
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
<h4 style="color: red">${message}</h4>
<table id="tableCustomer" class="table table-striped table-bordered" style="width: 100%">
    <thead>
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
    </thead>
    <tbody>
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
            <td><a id="a-edit" href="/customer?action=edit&id=${customer.id}">Edit</a></td>
            <td>
                <button onclick="getInfoDeleted('${customer.id}','${customer.name}')" type="button"
                        class="btn btn-sm btn-danger" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%--Modal--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete Customer</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <p><span id="modal"></span></p>
            </div>
            <form action="/customer" method="get">
                <input type="text" name="action" value="delete" hidden>
                <input type="text" name="deletedId" id="deletedId" hidden>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-danger">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>
<script src="/jquery/jquery-3.5.1.min.js"></script>
<script src="/datatables/js/jquery.dataTables.min.js"></script>
<script src="/datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'ltrip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script>
    function getInfoDeleted(id, name) {
        document.getElementById("modal").innerHTML = "<h3>Are you sure to delete " + name + "?</h3>";
        document.getElementById("deletedId").value = id;
    }
</script>
</html>
