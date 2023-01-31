<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/5/2023
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.css">
    <link rel="stylesheet" href="WEB-INF/home.css">
    <link rel="stylesheet" href="/bootstrap520/css/bootstrap.min.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap5.min.css">
</head>
<body>
<div class="container-fluid vh-100">
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
                            <a class="nav-link active a-navbar" aria-current="page" href="/book">Book</a>
                        </li>
                        <%--                        <li class="nav-item col-md-6">--%>
                        <%--                            <a class="nav-link active a-navbar" aria-current="page" href="/customer">Customer</a>--%>
                        <%--                        </li>--%>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-bs-toggle="dropdown" aria-expanded="false">Customer
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="/customer">Customer List</a></li>
                                <li><a class="dropdown-item" href="/customerContract">Customer using contract</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <%--                                <li><a class="dropdown-item" href="#">Something else here</a></li>--%>
                            </ul>
                        </li>
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/facility">Service</a>
                        </li>
                        <li class="nav-item col-md-6">
                            <a class="nav-link active a-navbar" aria-current="page" href="/contract">Contract</a>
                        </li>

                        <%--                        <li class="nav-item">--%>
                        <%--                            <a class="nav-link" href="#">Link</a>--%>
                        <%--                        </li>--%>

                        <%--                        <li class="nav-item">--%>
                        <%--                            <a class="nav-link disabled">Disabled</a>--%>
                        <%--                        </li>--%>
                    </ul>
                    <form class="d-flex m-1">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success bg-light" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
    <div class="row main bg-primary vh-100 ">
        <div class="vh-100 vw-100 p-0" style="width: 100%">
            <div id="carouselExampleCaptions" class="carousel slide" style="width: 100%" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                            aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                            aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                            aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active vw-100">
                        <img src="https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior-Furama-girl-with-pink-hat.jpg"
                             class="d-block vw-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>First slide label</h5>
                            <p>Some representative placeholder content for the first slide.</p>
                        </div>
                    </div>
                    <div class="carousel-item vw-100">
                        <div class="vh-100">
                            <img src="https://furamavietnam.com/wp-content/uploads/2018/10/02.-ICP-ICP_Furama_Danang_-Ball-Room-4.jpg"
                                 class="d-block vh-100 vw-100" alt="...">
                        </div>
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Second slide label</h5>
                            <p>Some representative placeholder content for the second slide.</p>
                        </div>
                    </div>
                    <div class="carousel-item vw-100">
                        <div class="vh-100">
                            <img src="https://phulong.com/UploadFiles/Images/FURAMA%2020%20NAM.jpg"
                                 class="d-block w-100 vw-100" alt="...">
                        </div>
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Third slide label</h5>
                            <p>Some representative placeholder content for the third slide.</p>
                        </div>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                        data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                        data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>

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
</html>
