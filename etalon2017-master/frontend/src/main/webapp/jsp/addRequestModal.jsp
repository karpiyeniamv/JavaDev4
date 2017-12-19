<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 16.10.2017
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/resources/js/addRequestModal.js"></script>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="addRequestModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" align="center">Add request</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form action="/faculty/addRequestModal" method="get">
                    <div class="form-group">
                        <label for="jsCompanyId">Company name</label>
                        <%--<input type="text" class="form-control" id="companyName">--%>
                        <select multiple size="2" class="form-control" id ="jsCompanyId" name ="jsCompanyId">
                            <c:forEach items="${companies}" var="company">
                                <option value = "${company.id}">${company.companyName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <div style="display: inline-block">
                            <label for="dateFrom">date from</label>
                            <input type="date" class="form-control dateFrom" id="dateFrom">
                        </div>
                        <div style="display: inline-block">
                            <label for="dateTo">date to</label>
                            <input type="date" class="form-control dateTo" id="dateTo">
                        </div>
                    </div>
                    <div class="form-group">
                        <div style="display: inline-block">
                            <label for="quantity">quantity</label>
                            <input type="number" min="0" class="form-control quantity" id="quantity">
                        </div>
                        <div style="display: inline-block">
                            <label for="score">minimum average score</label>
                            <input type="number" min="0" class="form-control score" id="score">
                        </div>
                    </div>
                    <div class="form-group">
                        <div style="display: inline-block; margin-right: 20px">
                        <%--<div style="display: inline-block">--%>
                        <label for="jsFacultyId">available faculties</label>
                        <%--<input type="text" class="form-control" id="faculties">--%>
                        <select multiple size="2" class="form-control" id ="jsFacultyId" name ="jsFacultyId">
                            <c:forEach items="${faculties}" var="faculty">
                                <option value = "${faculty.id}">${faculty.facultyName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div style="display: inline-block">
                        <label for="jsSpecialtyId">available specialities</label>
                        <%--<input type="text" class="form-control" id="specialities">--%>
                        <select multiple size="2" class="form-control" id ="jsSpecialtyId" name ="jsSpecialtyId">
                            <c:forEach items="${specialties}" var="specialty">
                                <option value = "${specialty.id}">${specialty.specialtyName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    </div>

                </form>
            </div>



            <div class="modal-footer" align="left">
                <button type="button" class="btn btn-primary jsCreateRequest" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
