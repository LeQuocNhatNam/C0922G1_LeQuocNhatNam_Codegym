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
    </style>
</head>

<body>
<center>
    <h2>Service List</h2>
</center>
<h6><a class="a-create" href="/service?action=create&type=villa">Add New Villa</a></h6>
<h6><a class="a-create" href="/service?action=create&type=house">Add New House</a></h6>
<h6><a class="a-create" href="/service?action=create&type=room">Add New Room</a></h6>
<a class="a-create" href="/home">Back to Home</a>
<table class="table table-dark table-hover">
    <tr>
        <th>No.</th>
        <th>Facility name</th>
        <th>Area (m2)</th>
        <th>Cost</th>
        <th>Max People</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <tr>
        <td>1</td>
        <td><a href="/service?action=details&serviceId=">Villa</a></td>
        <td>20</td>
        <td>100</td>
        <td>20</td>
        <td><a href="/facility?action=edit">edit</a></td>
        <td>
            <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
        </td>
    </tr>
    <tr>
        <td>2</td>
        <td><a href="/service?action=details&serviceId=">House</a></td>
        <td>20</td>
        <td>100</td>
        <td>20</td>
        <td><a href="/service?action=edit">edit</a></td>
        <td>
            <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
        </td>
    </tr>
    <tr>
        <td>3</td>
        <td><a href="/service?action=details&serviceId=">Room</a></td>
        <td>20</td>
        <td>100</td>
        <td>20</td>
        <td><a href="/service?action=edit">edit</a></td>
        <td>
            <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
        </td>
    </tr>
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
