<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(document).ready(function() {
            $("#searchRequest").keyup(function () {
                _this = this;
                $.each($("#jsARequestId option"), function () {
                    if ($(this).text().toLowerCase().indexOf($(_this).val().toLowerCase()) === -1) {
                        $(this).hide();
                    } else {
                        $(this).show();
                    }
                });
            });

            $("#searchStudent").keyup(function () {
                _this = this;
                $.each($("#jsAStudentId option"), function () {
                    if ($(this).text().toLowerCase().indexOf($(_this).val().toLowerCase()) === -1) {
                        $(this).hide();
                    } else {
                        $(this).show();
                    }
                });
            });
        });

    </script>
    <script src="${pageContext.request.contextPath}/resources/js/assignStudentsModal.js"></script>
</head>
<body>
<!-- Modal -->

<div class="modal fade" id="assignStudentsModal" role="dialog"  >
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" align="center">Assign students</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <form action="/students/assignStudentsModal" method="get">
            <div class="modal-body">
                <div>
                    <div class="form-group" style="display: inline-block;width: 43%;  margin-right: 10%">
                        <label for="searchRequest">Search requests</label>
                        <input type="text" class="form-control" id="searchRequest" value="Company name" >
                        <%--<button type="button" class="btn btn-primary" data-dismiss="modal" style="width: 40%">search</button>--%>
                    </div>
                    <div class="form-group" style="display: inline-block;width: 43% " >
                        <!-- drop-down list of students -->
                        <label for="searchStudent">Search students</label>
                        <input type="text" class="form-control" id="searchStudent" >
                        <%--<button type="button" class="btn btn-primary" data-dismiss="modal" style="width: 40%">add</button>--%>
                    </div>

                </div>
                <div>
                    <div class="form-group" style="display: inline-block; width: 43%; align-content: center;margin-right: 10%">
                        <select multiple size="8" class="form-control" id ="jsARequestId" name ="jsARequestId" style="overflow-x: auto;">
                            <c:forEach items="${requests}" var="request">
                                <option value = "${request.id}">${request.companyByCompanyId.companyName} - ${request.dateFrom} - ${request.dateTo}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group" style="display: inline-block;width: 43%; align-content: center;">
                        <select multiple size="8" class="form-control" id ="jsAStudentId" name ="jsAStudentId">
                            <c:forEach items="${students}" var="student">
                                <option value = "${student.id}">${student.lastName} ${student.firstName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
            </div>


            </form>

            <div class="modal-footer">
                <button type="button" class="btn btn-primary jsAssignStudent" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>

