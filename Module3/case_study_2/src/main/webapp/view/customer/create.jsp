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
    <link rel="stylesheet" href="view/home.css">
    <style>
        h5 {
            color: blue;
        }
    </style>
</head>
<body>
<div class="container-fluid vh-100 p-0">
    <div class="row bg-light header">
        <div class="col-md-3 d-flex justify-content-center align-items-center" id="logo">
            <img style="height: 100%" src="https://furamavietnam.com/wp-content/uploads/2018/08/logo@2x.png">
        </div>
        <div class="col-md-3"></div>
        <div class="col-md-3"></div>
        <div class="col-md-3 d-flex justify-content-end align-items-center"><h5>Nam Le</h5></div>
    </div>
    <div class="row row-navbar">
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/home">Home</a>
                        </li>
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/employee">Employee</a>
                        </li>
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/customer">Customer</a>
                        </li>
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/facility">Service</a>
                        </li>
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/contract">Contract</a>
                        </li>
                        <%--                       <li class="nav-item">--%>
                        <!--                            <a class="nav-link" href="#">Link</a>-->
                        <!--                        </li>-->
                        <!--                        <li class="nav-item dropdown">-->
                        <!--                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">-->
                        <!--                                Dropdown-->
                        <!--                            </a>-->
                        <!--                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">-->
                        <!--                                <li><a class="dropdown-item" href="#">Action</a></li>-->
                        <!--                                <li><a class="dropdown-item" href="#">Another action</a></li>-->
                        <!--                                <li><hr class="dropdown-divider"></li>-->
                        <!--                                <li><a class="dropdown-item" href="#">Something else here</a></li>-->
                        <!--                            </ul>-->
                        <!--                        </li>-->
                        <!--                        <li class="nav-item">-->
                        <!--                            <a class="nav-link disabled">Disabled</a>-->
                        <!--                        </li>-->
                    </ul>
                    <form class="d-flex m-1">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success bg-light" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
    <div class="vw-100" style="background-color: lightgray">
        <center>
            <h3>Add New Customer</h3>

            <a href="/customer">Back to Customer List</a>

        </center>
        <form method="post">
            <center>
                <table class="table table-borderless table-striped w-50 ">
                    <tr>
                        <td>Customer type</td>
                        <td>
                            <select name="customerTypeId">
                                <option value="">select customer type</option>
                                <c:forEach var="customerType" items="${customerTypeList}">
                                    <option value="${customerType.id}">${customerType.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td>
                            <input oninput="checkName(this.value)" type="text" size="20" name="name" required>
                        </td>
                        <td><span id="name-input"></span></td>
                    </tr>
                    <tr>
                        <td>Date Of Birth</td>
                        <td>
                            <input id="date-of-birth" min="${dateValidateList.get(0)}" max="${dateValidateList.get(1)}" type="date" size="20" name="dateOfBirth" required>
                        </td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td>
                            <input type="radio" name="gender" value="true" required>Male
                            <input type="radio" name="gender" value="false" required>Female
                        </td>
                    </tr>
                    <tr>
                        <td>ID card:</td>
<%--                        pattern="/^(\d{9}|\d{12})$/"--%>
                        <td>
                            <input oninput="checkIdCard(this.value)" type="number" size="20" name="idCard" required>
                            <span id="idCard-number"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td>
                            <input oninput="checkPhoneNumber(this.value)" type="text" size="20" name="phoneNumber" required>
                            <span id="phone-number"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td>
                            <input pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="wrong email" type="text" size="20" name="email" required>
                        </td>
                    </tr>
                    <tr>
                        <td>address</td>
                        <td>
                            <input type="text" name="address" required>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button class="btn btn-primary" id="btn-save" type="submit">Save</button>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><h5>${message}</h5></td>
                    </tr>
                </table>
            </center>
        </form>
    </div>
    <div class="row footer bg-secondary text-light">
        <div class="col-md-4 ">
            <h2>How to Get To Us</h2>
            <p>Furama is a premier base for exploring one of Asia’s most exciting new destinations.
                Just a short drive from Danang lay four UNESCO-listed World Heritage Sites:</p>
        </div>
        <div class="col-md-4">
            <h4>Local Places</h4>
            <table class="table table-hover text-light">
                <tr>
                    <td>1.</td>
                    <td>imperial city of HUE</td>
                    <td>2 hours</td>
                </tr>
                <tr>
                    <td>2.</td>
                    <td>The ancient city Hoi An</td>
                    <td>30 minutes</td>
                </tr>
                <tr>
                    <td>3.</td>
                    <td>Champa civilization</td>
                    <td>90 minutes</td>
                </tr>
                <tr>
                    <td>4.</td>
                    <td>Phong Nha Caves</td>
                    <td>3 hours</td>
                </tr>
            </table>
        </div>
        <div class="col-md-4">
            <h4>Contact Us</h4>
            <p>103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam
                Tel.: 84-236-3847 333/888 * Fax: 84-236-3847 666
                Email: reservation@furamavietnam.com * www.furamavietnam.com GDS Codes:
                Amadeus-GD DADFUR, Galileo/Apollo-GD 16236, Sabre-GD 032771, Worldspan- GD DADFU</p>
        </div>

    </div>
</div>
</body>
<script src="bootstrap-5.1.3-dist/js/bootstrap.js"></script>
<script>
    function checkName(name) {
        let regName = /^[A-Z][a-z]*(\s[A-Z][a-z]*)*$/;
        let checkedName = regName.exec(name);
        if (!checkedName) {
            document.getElementById("name-input").innerText = "Invalid! Please enter your name again";
            document.getElementById("btn-save").disabled = true;
        } else {
            document.getElementById("name-input").innerText = "Correct name!"
            document.getElementById("btn-save").disabled = false;
        }
    }
    function checkPhoneNumber(number) {
        let regPhoneNumber = /^((^090\d{7}$)|(091\d{7})|(\(84\)\+90\d{7})|(\(84\)\+91\d{7}))+$/;
        let checkPhoneNumber = regPhoneNumber.exec(number);
        if (!checkPhoneNumber) {
            document.getElementById("phone-number").innerText = "Invalid!";
            document.getElementById("btn-save").disabled = true;
        } else {
            document.getElementById("phone-number").innerText = "Ok!";
            document.getElementById("btn-save").disabled = false;
        }
    }
    function checkIdCard(number) {
        let regPhoneNumber = /^(\d{9}|\d{12})$/;
        let checkPhoneNumber = regPhoneNumber.exec(number);
        if (!checkPhoneNumber) {
            document.getElementById("idCard-number").innerText = "Invalid!";
            document.getElementById("btn-save").disabled = true;
        } else {
            document.getElementById("idCard-number").innerText = "Ok!";
            document.getElementById("btn-save").disabled = false;
        }
    }
    $(function () {
        $("#date-of-birth").datepicker({
            dateFormat: "dd-mm-yyyy"
        });
    });
</script>
</html>
