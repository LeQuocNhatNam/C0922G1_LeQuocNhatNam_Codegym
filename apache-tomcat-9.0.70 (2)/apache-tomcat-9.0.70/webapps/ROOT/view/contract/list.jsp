<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 1/7/2023
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>contract</title>
    <link rel="stylesheet" href="bootstrap-5.1.3-dist/css/bootstrap.css">
    <link rel="stylesheet" href="/bootstrap520/css/bootstrap.min.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap5.min.css">
    <style>
        h2 {
            color: pink;
        }

        h5 {
            color: blue;
        }
    </style>
</head>
<body>

<div class="col-lg-12">
    <center>
        <h2>Contract List</h2>
    </center>
    <h5>
        <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                data-bs-target="#exampleModal">Add New Contract
        </button>
    </h5>
    <table id="tableContract" class="table table-striped table-bordered" style="width: 100%">
        <thead>
        <tr>
            <th>#</th>
            <th>Service</th>
            <th>Customer</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Deposit</th>
            <th>Total</th>
            <th>Attached Service</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>Room Twin 01</td>
            <td>Nguyễn Thị Hào</td>
            <td>08/12/2020</td>
            <td>08/12/2020</td>
            <td>đ0</td>
            <td>đ1,000,000</td>
            <td>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">+
                </button>
                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal">Attached Service List
                </button>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<%--Modal--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Create New Contract</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                    <table class="table table-borderless table-hover">
                        <tr>
                            <td>Start Date</td>
                            <td><input type="date" size="70" placeholder="mm/dd/yyyy"></td>
                        </tr>
                        <tr>
                            <td>End Date</td>
                            <td><input type="date" size="70" placeholder="mm/dd/yyyy"></td>
                        </tr>
                        <tr>
                            <td>Deposit</td>
                            <td><input type="number" size="70"></td>
                        </tr>
                        <tr>
                            <td>Total</td>
                            <td><input type="number" size="70" placeholder="đ0" disabled></td>
                        </tr>
                        <tr>
                            <td>Customer using service</td>
                            <td>
                                <select name="customerSelecting" >
                                    <option value="">Select customer</option>
                                    <option value="1">Customer 1</option>
                                    <option value="2">Customer 2</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Service</td>
                            <td>
                                <select name="service">
                                    <option value="">Select service</option>
                                    <option value="1">Service 1</option>
                                    <option value="2">Service 2</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Attached service</td>
                            <td>
                                <button type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                                        data-bs-target="#exampleModal">+
                                </button>
                            </td>
                        </tr>

                    </table>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary">Create Contract</button>
            </div>
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
        $('#tableContract').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });

</script>
</html>
