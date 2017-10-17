<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>System demands panel</title>
</head>
<body>
<jsp:include page="/jsp/blocks/header.jsp"/>

<div class="container">
    <jsp:include page="/jsp/blocks/title.jsp">
        <jsp:param name="heading" value="Welcome on System demands panel"/>
    </jsp:include>
</div>

<br>
<br>

<table class="table" id="table-lizing-traktor">

    <script>
        var countDemands = demands.length;

        var table = document.createElement('table');
        table.setAttribute('class', 'table table-striped table-bordered');
        var thead = document.createElement('thead');
        thead.style.fontWeight = 'bold';
        var tr = document.createElement('tr');
        tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td><td>#</td><td>Company name</td><td>Date from</td><td>Date to</td><td>Status</td><td>Faculty</td><td>Specialty</td><td>min average score</td><td>total quantity</td><td>available quantity</td>';
        thead.appendChild(tr);
        table.appendChild(thead);

        var tbody = document.createElement('tbody');
        var items = ['companyName', 'dateFrom', 'dateTo', 'status', 'faculty', 'speciality', 'score', 'totalQuantity', 'availableQuantity'];
        for (var i = 0; i < countDemands; i++) {
            var tr = document.createElement('tr');
            tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td>';
            var td = document.createElement('td');
            td.innerHTML = i + 1;
            tr.appendChild(td);
            for (var j = 0; j < 9; j++) {
                var td = document.createElement('td');
                var item = demands[i][items[j]];
                td.innerHTML = item;
                tr.appendChild(td);
            }
            tbody.appendChild(tr);
        }
        table.appendChild(tbody);
        document.getElementById('table-lizing-traktor').appendChild(table);
    </script>
</table>

<div align="center">
    <button type="button" class="btn btn-primary" style="width: 9%" data-toggle="modal"
            data-target="#assignStudentsModal">Assiqn student
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" style="width: 9%" data-toggle="modal" data-target="#addRequestModal">
        Edit
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" style="width: 9%">Delete</button>
</div>

<jsp:include page="/jsp/addRequestModal.jsp"/>
<jsp:include page="/jsp/assignStudentsModal.jsp"/>


</body>
</html>
