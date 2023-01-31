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
            text-decoration: none;
            color: white;
        }
    </style>
</head>

<body>
<center>
    <h2>Borrow Book List</h2>
</center>
<h6>
    <button class="text-white bg-dark"><a style="text-decoration: none; color: white" class="a-create"
                                          href="/facility?action=create">Add New Facility</a></button>
</h6>
<form action="/bookCard?action=search" method="post">
    <div style="justify-content: space-between;" class="d-flex">
        <a class="a-create" href="/home">Back to Home</a>

        <div>
            <input type="text" name="bookSearch" placeholder="Search boook">
            <input type="text" name="studentSearch" placeholder="Student name">
            <button type="submit">Search</button>
        </div>
    </div>
</form>
<%--deleted message--%>
<h4 style="color: red"></h4>
<table id="tableFacility" class="table table-striped table-bordered" style="width: 100%">
    <thead>
    <tr>
        <th>Book Borrow ID</th>
        <th>Book Name</th>
        <th>Author</th>
        <th>Student Name</th>
        <th>Class</th>
        <th>Borrow Date</th>
        <th>Return Date</th>
        <th>Option</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="bookCard" items="${bookCardList}" >
    <tr>
        <td>${bookCard.bookBorrowId}</td>
        <td>${bookCard.book.name}</td>
        <td>${bookCard.book.author}</td>
        <td>${bookCard.student.name}</td>
        <td>${bookCard.student.className}</td>
        <td>${bookCard.borrowDate}</td>
        <td>${bookCard.returnDate}</td>
        <td>
            <button class="btn btn-primary" type="button"><a id="a-edit" href="/book?action=borrow&bookName=${book.name}&bookId=${book.id}">Borrow</a>
            </button>
        </td>
            <%--        <td>--%>
            <%--            <button onclick="getInfoDeleted()" type="button"--%>
            <%--                    class="btn btn-sm btn-danger" data-bs-toggle="modal"--%>
            <%--                    data-bs-target="#exampleModal">--%>
            <%--                Delete--%>
            <%--            </button>--%>
            <%--        </td>--%>
    </tr>
    </c:forEach>
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
