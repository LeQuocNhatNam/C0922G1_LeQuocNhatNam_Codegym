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
            <th>Contract ID</th>
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
        <c:forEach var="customerUsingService" items="${customerUsingServiceList}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${customerUsingService.contractId}</td>
                <td>${customerUsingService.serviceName}</td>
                <td>${customerUsingService.customerName}</td>
                <td>${customerUsingService.startDate}</td>
                <td>${customerUsingService.endDate}</td>
                <td>${customerUsingService.deposit}</td>
                <td>${customerUsingService.total}</td>
                <td>
                    <button onclick="passContractId(${customerUsingService.contractId})" type="button"
                            class="btn btn-sm btn-primary" data-bs-toggle="modal"
                            data-bs-target="#modalAdd">+
                    </button>
                    <button onclick="passContractIdAttach(${customerUsingService.contractId})" type="button" class="btn btn-sm btn-primary" data-bs-toggle="modal"
                            data-bs-target="#modalAttachService">Attached Service List
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%--Modal--%>
<div class="modal fade" id="modalAdd" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Add Attach Facility</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="/contract?action=addAttachFacility" method="post"></form>
                <input type="hidden" value="" id="contractId">
                <table class="table table-borderless table-hover ">
                    <tr>
                        <td>Attach Facility</td>
                        <td>
                            <select name="attachFacilityId" id="">
                                <option value="">Select Attach Facility</option>
                                <c:forEach var="attachFacility" items="${attachFacilityList}">
                                    <option value="${attachFacility.id}}">${attachFacility.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Quantity</td>
                        <td>
                            <input type="number" placeholder="eg.1,2" name="quantity">
                        </td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary">Add</button>
            </div>
        </div>
    </div>
</div>
<%--Modal--%>
<div class="modal fade" id="modalAttachService" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Create New Contract</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <table class="table table-borderless table-hover">
                    <tr>
                        <th>id</th>
                        <th>Name</th>
                        <th>Cost</th>
                        <th>Unit</th>
                        <th>Status</th>

                    </tr>
                    <p id="table-attach"></p>


                </table>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary">Create Contract</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddContract" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Create New Contract</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <table class="table table-borderless table-hover">
                    <tr>
                        <td>Start Date</td>
                        <td><input type="date" size="70" placeholder="mm/dd/yyyy"></td>
                    </tr>
                    <tr>
                        <td>Date</td>
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
                            <select name="customerSelecting">
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

    function passContractId(contractId) {
        document.getElementById("contractId").value = contractId;
    }


    <%--function passContractIdAttach(contractId) {--%>
    <%--    document.getElementById("table-attach").innerHTML =--%>
    <%--        "<c:forEach items='${map.get('"--%>
    <%--    --%>

    <%--}--%>
</script>
</html>
