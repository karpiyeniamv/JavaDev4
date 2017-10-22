function systemStudentPanelView() {
    var countStudents = students.length;
    var table=document.createElement('table');
    table.id='myTable';
    var thead = document.createElement('thead');
    thead.style.fontWeight = 'bold';
    var tr = document.createElement('tr');
    tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td><td>First Name</td><td>Last Name</td><td>Faculty</td><td>Specialty</td><td>Group</td><td>Is budget</td><td>Average score</td><td>Status</td><td>Name of Company</td><td>Practice period</td><td>Show info</td>';
    thead.appendChild(tr);
    table.appendChild(thead);

    var tbody = document.createElement('tbody');
    table.appendChild(tbody);
    var items = ['firstName', 'lastName', 'faculty', 'specialty', 'group', 'isBudget', 'averageScore', 'status', 'nameOfCompany', 'practicePeriod'];
    for (var i = 0; i < countStudents; i++) {
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
        btn.onclick = function () {
            window.location = 'studentsView.jsp';
        };
        btn.innerHTML = 'Show';
        tr.appendChild(btn);
        tbody.appendChild(tr);
    }

    document.getElementById('table-lizing-traktor').appendChild(table);
}

function tbodyTableStudents() {
    var countStudents = students.length;
    var tbody = document.createElement('tbody');
    var items = ['firstName', 'lastName', 'faculty', 'specialty', 'group', 'isBudget', 'averageScore', 'status', 'nameOfCompany', 'practicePeriod'];
    for (var i = 0; i < countStudents; i++) {
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
        btn.onclick = function () {
            window.location = 'studentsView.jsp';
        };
        btn.innerHTML = 'Show';
        tr.appendChild(btn);
        tbody.appendChild(tr);
    }

    document.getElementById('table-lizing-traktor').appendChild(tbody);
}


function requestsView () {
    var countDemands = demands.length;
    var table = document.createElement('table');
    table.setAttribute('class', 'table table-striped table-bordered');
    var thead = document.createElement('thead');
    thead.style.fontWeight = 'bold';
    var tr = document.createElement('tr');
    tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td><td>Company name</td><td>Date from</td><td>Date to</td><td>Status</td><td>Faculty</td><td>Specialty</td><td>min average score</td><td>total quantity</td><td>available quantity</td>';
    thead.appendChild(tr);
    table.appendChild(thead);

    var tbody = document.createElement('tbody');
    var items = ['companyName', 'dateFrom', 'dateTo', 'status', 'faculty', 'speciality', 'score', 'totalQuantity', 'availableQuantity'];
    for (var i = 0; i < countDemands; i++) {
        var tr = document.createElement('tr');
        tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td>';
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

}

function tbodeTableRequests () {
    var countDemands = demands.length;
    var tbody = document.createElement('tbody');
    var items = ['companyName', 'dateFrom', 'dateTo', 'status', 'faculty', 'speciality', 'score', 'totalQuantity', 'availableQuantity'];
    for (var i = 0; i < countDemands; i++) {
        var tr = document.createElement('tr');
        tr.innerHTML = '<td><input type="checkbox" />&nbsp;</td>';
        for (var j = 0; j < 9; j++) {
            var td = document.createElement('td');
            var item = demands[i][items[j]];
            td.innerHTML = item;
            tr.appendChild(td);
        }
        tbody.appendChild(tr);
    }
    document.getElementById('table-lizing-traktor').appendChild(tbody);

}

function studentsView() {
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

}