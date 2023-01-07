<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/6/2023
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<c:import url="/view/navbar.jsp"></c:import>
<h1>Student list</h1>
<form action="/student?action=search" method="post">
    <input type="searchName" placeholder="enter name">
    <select name="searchClassId">
        <option value="">select class</option>
        <c:forEach var="clazz" items="${clazzList}">
            <option value="${clazz.id}">${clazz.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Search</button>
</form>
<a href="/student?action=create">Add new Student</a>
<p>${mess}</p>
<table class="table table-dark">
    <tr>
        <th>No.</th>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Point</th>
        <th>Rank</th>
        <th>Class name</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="student" items="${student1List}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <c:if test="${student.gender}">
                <td>male</td>
            </c:if>
            <c:if test="${!student.gender}">
                <td>female</td>
            </c:if>
            <td>${student.point}</td>
            <c:choose>
                <c:when test="${student.point>=8}">
                    <td>Excellent</td>
                </c:when>
                <c:when test="${student.point>=7}">
                    <td>Good</td>
                </c:when>
                <c:when test="${student.point>=5}">
                    <td>Pretty Good</td>
                </c:when>
                <c:otherwise>
                    <td>Bad</td>
                </c:otherwise>
            </c:choose>
            <td>${student.clazz.name}</td>
            <td>
                <button onclick="infoDelete('${student.id}','${student.name}')" type="button" class="btn btn-danger"
                        data-bs-toggle="modal" data-bs-target="#exampleModal">Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/student?action=delete" method="post">
                <div class="modal-body">
                    <input hidden type="text" id="deleteId" name="deleteId">
                    <span>Bạn có muốn xoá sinh viên </span>
                    <span style="color: red" id="deleteName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-sm btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-sm btn-primary">Delete</button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
<script>
    function infoDelete(id, name) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").value = name;
    }
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>
