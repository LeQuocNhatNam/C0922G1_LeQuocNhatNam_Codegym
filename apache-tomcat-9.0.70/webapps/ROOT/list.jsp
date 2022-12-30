<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 12/30/2022
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.css">
<body>
<div class="row d-flex justify-content-center">
    <div class="col-md-12 d-flex justify-content-center"><h3 class="bg-dark text-light">Danh sách khách hàng</h3></div>
    <div class="col-md-12 d-flex justify-content-center">
        <table class="table table-primary table-info border-danger border-secondary table-hover" style="width: 70%">
            <tr>
                <th>Tên</th>
                <th>Ngày sinh</th>
                <th>Địa chỉ</th>
                <th>Ảnh</th>
            </tr>
            <c:forEach var="customer" items="${list}" varStatus="status">
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.dateOfBirth}</td>
                    <td>${customer.address}</td>
                    <td>
                        <div style="height: 50px; width: 50px">
                            <img width="100%" height="100%" src="${customer.imgAddress}" alt="NONE">
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

</div>
<link rel="stylesheet" href="bootstrap-5.1.3-dist/js/bootstrap.js">
</body>
</html>
