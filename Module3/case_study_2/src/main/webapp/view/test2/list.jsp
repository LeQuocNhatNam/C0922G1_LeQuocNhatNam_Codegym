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
  <h2>Facility List</h2>
</center>
<h6><button class="text-white bg-dark" ><a style="text-decoration: none; color: white" class="a-create" href="/facility?action=create">Add New Facility</a></button></h6>
<form action="/facility?action=search" method="post">
  <div style="justify-content: space-between;" class="d-flex">
    <a class="a-create" href="/home">Back to Home</a>

    <div>
<%--      <select name="facilityTypeIdSearch" id="">--%>
<%--        <option value="">Select Facility Type</option>--%>
<%--        <c:forEach var="facilityType" items="${facilityTypeList}">--%>
<%--          <option value="${facilityType.id}">${facilityType.name}</option>--%>
<%--        </c:forEach>--%>
<%--      </select>--%>
      <input type="text" name="nameSearch" placeholder="Search by name">
      <button type="submit">Search</button>
    </div>
  </div>
</form>
<%--deleted message--%>
<h4 style="color: red"></h4>
<table id="tableFacility" class="table table-striped table-bordered" style="width: 100%">
  <thead>
  <tr>
    <th>#</th>
    <th>Name</th>
    <th>Id</th>
<%--    <th>Area</th>--%>
<%--    <th>Cost</th>--%>
<%--    <th>Max People</th>--%>
<%--    <th>Rent Type</th>--%>
<%--    <th>Standard Room</th>--%>
<%--    <th>Other Convenience</th>--%>
<%--    <th>Pool Area</th>--%>
<%--    <th>Number Of Floors</th>--%>
<%--    <th>Free Facility</th>--%>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  </thead>
  <tbody>

    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><a id="a-edit" href="/facility?action=edit&id=">Edit</a></td>
      <td>
        <button onclick="getInfoDeleted()" type="button"
                class="btn btn-sm btn-danger" data-bs-toggle="modal"
                data-bs-target="#exampleModal">
          Delete
        </button>
      </td>
    </tr>

  </tbody>
</table>
<%--Modal--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Delete facility</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p><span id="modal"></span></p>
      </div>
      <form action="/facility" method="get">
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
    $('#tableFacility').dataTable({
      "dom": 'ltrip',
      "lengthChange": false,
      "pageLength": 5
    });
  });
</script>
<script>

</script>
</html>
