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
    <script src="${pageContext.request.contextPath}/resources/js/libs/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/libs/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/libs/bootstrap-3.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/docs.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.tablesorter.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.tablesorter.pager.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.tablesorter.widgets.js"></script>
    <style>
        .tablesorter-pager .btn-group-sm .btn {
            font-size: 1.2em;
        }
    </style>
    <script id="js" type="text/javascript">

        var $ = jQuery;
        $(document).ready(function ($) {

            $("table").tablesorter({
                theme: "bootstrap",

                widthFixed: true,

                // widget code contained in the jquery.tablesorter.widgets.js file
                // use the zebra stripe widget if you plan on hiding any rows (filter widget)
                // the uitheme widget is NOT REQUIRED!
                widgets: ["filter", "columns", "zebra"],

                widgetOptions: {
                    // using the default zebra striping class name, so it actually isn't included in the theme variable above
                    // this is ONLY needed for bootstrap theming if you are using the filter widget, because rows are hidden
                    zebra: ["even", "odd"],

                    // class names added to columns when sorted
                    columns: ["primary", "secondary", "tertiary"],

                    // reset filters button
                    filter_reset: ".reset",

                    // extra css class name (string or array) added to the filter element (input or select)
                    filter_cssFilter: [
                        'form-control',
                        'form-control',
                        'form-control custom-select', // select needs custom class names :(
                        'form-control',
                        'form-control',
                        'form-control',
                        'form-control'
                    ]

                }
            })
                .tablesorterPager({

                    // target the pager markup - see the HTML block below
                    container: $(".ts-pager"),

                    // target the pager page select dropdown - choose a page
                    cssGoto: ".pagenum",

                    // remove rows from the table to speed up the sort of large tables.
                    // setting this to false, only hides the non-visible rows; needed if you plan to add/remove rows with the pager enabled.
                    removeRows: false,

                    // output string - default is '{page}/{totalPages}';
                    // possible variables: {page}, {totalPages}, {filteredPages}, {startRow}, {endRow}, {filteredRows} and {totalRows}
                    output: '{startRow} - {endRow} / {filteredRows} ({totalRows})'

                });

        });</script>

    <script>
        $(document).ready(function () {

            // filter button demo code
            $('button.filter').click(function ($) {
                var col = $(this).data('column'),
                    txt = $(this).data('filter');
                $('table').find('.tablesorter-filter').val('').eq(col).val(txt);
                $('table').trigger('search', false);
                return false;
            });

            // toggle zebra widget
            $('button.zebra').click(function () {
                var t = $(this).hasClass('btn-success');
                $('table')
                    .toggleClass('table-striped')[0]
                    .config.widgets = (t) ? ["filter"] : ["filter", "zebra"];
                $(this)
                    .toggleClass('btn-danger btn-success')
                    .find('span')
                    .text(t ? 'disabled' : 'enabled');
                $('table').trigger('refreshWidgets', [false]);
                return false;
            });
        });
    </script>
</head>
<body>
<jsp:include page="/jsp/blocks/header.jsp"/>

<div class="container">
    <jsp:include page="/jsp/blocks/title.jsp">
        <jsp:param name="heading" value="Welcome on System student panel"/>
    </jsp:include>
</div>

<div align="center">
    <button type="button" class="btn btn-primary" onclick="window.location='requestsView.jsp'">Show all requests
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addRequestModal">Add request
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createStudentModal">Create student
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign
        students
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createSpecialtyModal">Create
        specialty
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createFacultyModal">Create faculty
    </button>
</div>



<br>

<table id="table-lizing-traktor" class="display" width="100%" cellspacing="0">


    <thead>
    <tr>
        <td class="sorter-false filter-false"><input  type="checkbox" />&nbsp;</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Faculty</td>
        <td>Specialty</td>
        <td>Group</td>
        <td>Is budget</td>
        <td>Average score</td>
        <td>Status</td>
        <td>Name of Company</td>
        <td>Practice period</td>
        <td class="sorter-false filter-false">Show info </td>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <th colspan="12" class="ts-pager">
            <div class="form-inline">
                <div class="btn-group btn-group-sm mx-1" role="group">
                    <button type="button" class="btn btn-secondary first" title="first">&#8676;</button>
                    <button type="button" class="btn btn-secondary prev" title="previous">&larr;</button>
                </div>
                <span class="pagedisplay"></span>
                <div class="btn-group btn-group-sm mx-1" role="group">
                    <button type="button" class="btn btn-secondary next" title="next">&rarr;</button>
                    <button type="button" class="btn btn-secondary last" title="last">&#8677;</button>
                </div>
                <select class="form-control-sm custom-select px-1 pagesize" title="Select page size">
                    <option selected="selected" value="10">10</option>
                    <option value="20">20</option>
                    <option value="30">30</option>
                    <option value="all">All Rows</option>
                </select>
                <select class="form-control-sm custom-select px-4 mx-1 pagenum" title="Select page number"></select>
            </div>
        </th>
    </tr>
    </tfoot>
    <script>
    tbodyTableStudents()
</script>
</table>

<jsp:include page="/jsp/addRequestModal.jsp"/>
<jsp:include page="/jsp/createStudentModal.jsp"/>
<jsp:include page="/jsp/assignStudentsModal.jsp"/>
<jsp:include page="/jsp/createSpecialtyModal.jsp"/>
<jsp:include page="/jsp/createFacultyModal.jsp"/>


<div align="center">
    <button type="button" class="btn btn-primary">Delete</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary">Release</button>
</div>

<br><br>

</body>
</html>
