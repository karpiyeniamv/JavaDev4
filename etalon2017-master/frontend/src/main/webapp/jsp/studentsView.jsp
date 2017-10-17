<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 16.10.2017
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student panel</title>
</head>
<body>
<jsp:include page="/jsp/blocks/header.jsp"/>

<div class="container">
    <jsp:include page="/jsp/blocks/title.jsp">
        <jsp:param name="heading" value="Welcome on Student panel"/>
    </jsp:include>
</div>

<br>
<br>

<table border="0" class="table" id="table-lizing-traktor">

    <script>
        var items = ['firstName', 'lastName', 'faculty', 'specialty', 'group', 'isBudget', 'averageScore', 'status', 'nameOfCompany', 'practicePeriod'];
        var table = document.createElement('table');
        table.setAttribute('class', 'table table-striped ');
        var tr = document.createElement('tr');
        tr.innerHTML = '<td>First Name</td>';
        var td = document.createElement('td');
        var item = students[index][items[0]];
        td.innerHTML = item;
        tr.appendChild(td);

        var td = document.createElement('td');
        td.innerHTML = 'Last Name';
        tr.appendChild(td);
        var td = document.createElement('td');
        var item = students[index][items[1]];
        td.innerHTML = item;
        tr.appendChild(td);
        table.appendChild(tr);

        var tr = document.createElement('tr');
        var td = document.createElement('td');
        td.innerHTML = 'Faculty';
        tr.appendChild(td);
        var td = document.createElement('td');
        var item = students[index][items[2]];
        td.innerHTML = item;
        tr.appendChild(td);

        var td = document.createElement('td');
        td.innerHTML = 'Specialty';
        tr.appendChild(td);
        var td = document.createElement('td');
        var item = students[index][items[3]];
        td.innerHTML = item;
        tr.appendChild(td);
        table.appendChild(tr);

        var tr = document.createElement('tr');
        var td = document.createElement('td');
        td.innerHTML = 'Group';
        tr.appendChild(td);
        var td = document.createElement('td');
        var item = students[index][items[4]];
        td.innerHTML = item;
        tr.appendChild(td);

        var td = document.createElement('td');
        td.innerHTML = 'Is budget';
        tr.appendChild(td);
        var td = document.createElement('td');
        var item = students[index][items[5]];
        td.innerHTML = item;
        tr.appendChild(td);
        table.appendChild(tr);

        var tr = document.createElement('tr');
        var td = document.createElement('td');
        td.innerHTML = 'Practice date from';
        tr.appendChild(td);
        var td = document.createElement('td');
        td.innerHTML = ' ';
        tr.appendChild(td);

        var td = document.createElement('td');
        td.innerHTML = 'Practice date to';
        tr.appendChild(td);
        var td = document.createElement('td');
        td.innerHTML = ' ';
        tr.appendChild(td);
        table.appendChild(tr);

        var tr = document.createElement('tr');
        var td = document.createElement('td');
        td.innerHTML = 'Average score';
        tr.appendChild(td);
        var td = document.createElement('td');
        var item = students[index][items[6]];
        td.innerHTML = item;
        tr.appendChild(td);

        var td = document.createElement('td');
        td.innerHTML = 'Comments';
        tr.appendChild(td);
        var td = document.createElement('td');
        td.innerHTML = ' ';
        tr.appendChild(td);
        table.appendChild(tr);


        document.getElementById('table-lizing-traktor').appendChild(table);
    </script>
</table>

</body>
</html>
