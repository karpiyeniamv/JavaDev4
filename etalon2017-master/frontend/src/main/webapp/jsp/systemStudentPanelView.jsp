<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 16.10.2017
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>System student panel</title>
</head>
<body>
<jsp:include page="/jsp/blocks/header.jsp"/>

<div class="container">
    <jsp:include page="/jsp/blocks/title.jsp">
        <jsp:param name="heading" value="Welcome on System student panel" />
    </jsp:include>
</div>

<br>
<br>

<div align="center">
    <button type="button" class="btn btn-primary" onclick= "window.location='requestsView.jsp'" >Show all requests</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addRequestModal">Add request</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createStudentModal">Create student</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign students </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createSpecialtyModal">Create specialty</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createFacultyModal">Create faculty</button>
</div>

<jsp:include page="/jsp/addRequestModal.jsp"/>
<jsp:include page="/jsp/createStudentModal.jsp"/>
<jsp:include page="/jsp/assignStudentsModal.jsp"/>
<jsp:include page="/jsp/createSpecialtyModal.jsp"/>
<jsp:include page="/jsp/createFacultyModal.jsp"/>

<br>
<br>
<br>

<table class="table" id="table-lizing-traktor">

    <script>
    var countStudents = students.length;

    var table = document.createElement('table');
    table.setAttribute('class','table table-striped table-bordered');
    var thead = document.createElement('thead');
    thead.style.fontWeight='bold';
    var tr = document.createElement('tr');
    tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td><td>First Name</td><td>Last Name</td><td>Faculty</td><td>Specialty</td><td>Group</td><td>Is budget</td><td>Average score</td><td>Status</td><td>Name of Company</td><td>Practice period</td><td>Show info</td>';
    thead.appendChild(tr);
    table.appendChild(thead);

    var tbody = document.createElement('tbody');
    var items = ['firstName','lastName','faculty','specialty','group','isBudget','averageScore', 'status','nameOfCompany','practicePeriod'];
    for(var i = 0; i < countStudents; i++){
    var tr = document.createElement('tr');
    tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td>';
    for (var j = 0; j < 10; j++) {
    var td = document.createElement('td');
    var item = students[i][items[j]];
    td.innerHTML = item;
    tr.appendChild(td);
    }
    var btn = document.createElement('button');
    btn.setAttribute('class', 'btn btn-primary');
    btn.onclick= function() {
        window.location='studentsView.jsp';
    };
    btn.innerHTML='Show';
    tr.appendChild(btn);
    tbody.appendChild(tr);
    }
    table.appendChild(tbody);
    document.getElementById('table-lizing-traktor').appendChild(table);
    </script>
</table>
<div align="center">
<button type="button" class="btn btn-primary">Delete </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary">Release </button>
</div>

</body>
</html>
