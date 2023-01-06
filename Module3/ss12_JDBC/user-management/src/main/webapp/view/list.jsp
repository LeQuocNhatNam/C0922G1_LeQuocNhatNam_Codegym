<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/4/2023
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="../../../bootstrap-5.1.3-dist/css/bootstrap.css">
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<div>
    <center>
        <h3>User Management</h3>
        <h4>
            <a href="/users?action=create">Add new User</a>
        </h4>
        <h5>Search By Country
            <form action="/users?action=searchByCountry" method="post">
                <input type="text" name="country" size="30">
                <button type="submit">Search</button>
            </form>
        </h5>
        <%--    <h2 style="color: green">Search By Name--%>
        <%--        <form action="/users?action=searchByName" method="post">--%>
        <%--            <input type="text" name="name" size="30">--%>
        <%--            <button type="submit">Search</button>--%>
        <%--        </form>--%>
        <%--    </h2>--%>
        <h6>
            <form action="/users" method="get">
                <input type="text" name="action" value="sort" hidden>
                <button type="submit">Sort By Name</button>
            </form>
        </h6>
        <h3>
            <c:if test="${message!=null}">
                ${message}
            </c:if>
        </h3>
    </center>
</div>
<div class="">
    <center>
        <h5>List of User</h5>
    </center>
    <table class="table table-dark table-striped">

        <tr>
            <th>No.</th>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="user" items="${listUser}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                </td>
                <td>
                    <button onclick="infoDelete('${user.id}','${user.name}','${user.email}','${user.country}')"
                            type="button" class="btn btn-primary bg-danger" data-bs-toggle="modal"
                            data-bs-target="#exampleModal">Delete
                    </button>
                        <%--                        <button onclick="infoDelete('${user.id}','${user.name}')">--%>
                        <%--                            Delete--%>
                        <%--                        </button>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete User</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <p id="deleteInfo"></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                <form action="/users" method="get">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" id="idDeleted" name="id">
                    <button type="submit" class="btn btn-primary">Delete</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>

<script>
    function infoDelete(id, name, email, country) {
        document.getElementById("deleteInfo").innerHTML = name + "<br>" + email + "<br>" + country;
        document.getElementById("idDeleted").value = id;
    }
</script>
<script src="../../../bootstrap-5.1.3-dist/js/bootstrap.js"></script>
</html>
