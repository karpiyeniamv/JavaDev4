<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/resources/js/libs/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/libs/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/createStudentModal.js"></script>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="createStudentModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" align="center">Create student</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>


            <form action="/faculty/createStudentModal" method="get">
            <div class="modal-body">
                <div>
                    <div class="form-group" style="display: inline-block">
                        <label for="lastName">Last name</label>
                        <input type="text" class="form-control lastName" id="lastName">
                    </div>
                    <div class="form-group" style="display: inline-block">
                        <label for="firstName">First name</label>
                        <input type="text" class="form-control firstName" id="firstName">
                    </div>
                </div>

                <div>
                    <div class="form-group" style="display: inline-block">
                        <label for="jsMFacultyId">Faculty</label>
                        <select multiple size="2" class="form-control jsMFacultyId" id ="jsMFacultyId" name ="jsMFacultyId">
                            <c:forEach items="${faculties}" var="faculty">
                                <option value = "${faculty.id}">${faculty.facultyName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group" style="display: inline-block">
                        <label for="jsMSpecialtyId">Specialty</label>
                        <select multiple size="2" class="form-control" id ="jsMSpecialtyId" name ="jsMSpecialtyId">
                            <c:forEach items="${specialties}" var="specialty">
                                <option value = "${specialty.id}">${specialty.specialtyName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div>
                    <div class="form-group">
                        <label for="mgroup">Group</label>
                        <input type="text" class="form-control mgroup" id="mgroup">

                        <label for="jsMIsBudgetId">Is budget?</label>
                        <%--<input type="text" class="form-control isBudget" id="isBudget">--%>
                        <select multiple size="2" class="form-control" id ="jsMIsBudgetId" name ="jsMIsBudgetId">
                            <option value="1">true</option>
                            <option value="-1">false</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="mscore">Average score</label>
                        <input type="number" step="1" class="form-control mscore" id="mscore">
                    </div>

                    <div class="form-group">
                        <label for="jsMRequestId">Available demands</label>
                        <select multiple size="2" class="form-control" id ="jsMRequestId" name ="jsMRequestId">
                            <c:forEach items="${requests}" var="request">
                                <option value = "${request.id}">${request.companyByCompanyId.companyName}-${request.dateFrom}-${request.dateTo}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
            </div>

            <div class="modal-footer" align="left">
                <button type="button" class="btn btn-primary jsCreateStudent" data-dismiss="modal">Create</button>
            </div>
            </form>
        </div>
    </div>
</div>
</div>

</body>
</html>
