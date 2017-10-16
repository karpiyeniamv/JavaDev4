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
    <button type="button" class="btn btn-primary" >Show all requests</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Add request</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary">Create student</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary">Assign students </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary">Create specialty</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary">Create faculty</button>
</div>

<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title"  align="center">Add request</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                <div class="form-group">
                    <label for="email">Company name</label>
                    <input type="email" class="form-control" id="email">
                </div>
                <div class="form-group" >
                    <div style="display: inline-block">
                    <label for="pwd">date from</label>
                    <input type="password" class="form-control" id="pwd" >
                    </div>
                    <div style="display: inline-block">
                    <label for="pwd">date to</label>
                    <input type="password" class="form-control" id="pwd1" >
                    </div>
                </div>
                    <div class="form-group">
                        <div style="display: inline-block">
                            <label for="pwd">quantity</label>
                            <input type="password" class="form-control" id="pwd2" >
                        </div>
                        <div style="display: inline-block">
                            <label for="pwd">available faculties</label>
                            <input type="password" class="form-control" id="pwd3" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email">available specialities</label>
                        <input type="email" class="form-control" id="email1">
                    </div>
                    <div class="form-group">
                        <label for="email">minimum average score</label>
                        <input type="email" class="form-control" id="email2">
                    </div>


                <div class="checkbox">
                    <label><input type="checkbox"> Remember me</label>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

<br>
<br>
<br>

<table class="table">
    <thead class="thead-inverse" id="table-lizing-traktor">

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
    btn.innerHTML='Show';
    tr.appendChild(btn);
    tbody.appendChild(tr);
    }
    table.appendChild(tbody);
    document.getElementById('table-lizing-traktor').appendChild(table);
    </script>
    </thead>
</table>
<div align="center">
<button type="button" class="btn btn-primary">Delete </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary">Assign </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary">Release </button>
</div>

</body>
</html>
