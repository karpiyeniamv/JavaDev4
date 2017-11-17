<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>


</head>
<body>
<!-- Modal -->
<div class="modal fade" id="createSpecialtyModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" align="center">Create specialty</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>



            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="nameOfSpecialty">Name of specialty</label>
                        <input type="text" class="form-control" id="nameOfSpecialty">
                    </div>
                    <%--<div class="form-group">--%>
                        <%--<label for="facultyViewModelList">Available faculties</label>--%>
                        <%--<select id="facultyViewModelList">--%>
                            <%--<c:forEach items="${facultyViewModelList}" var="facultyViewModel">--%>
                                <%--<option name="faculty" value="${facultyViewModel.id}">${facultyViewModel.getFacultyName}</option>--%>
                            <%--</c:forEach>--%>
                        <%--</select>--%>
                    <%--</div>--%>
                    </div>
                </form>
            </div>

        <!-- Request One -->
        <form action="/createSpecialtyModal" method="get">
            <input type="submit" value="createSpecialtyModal">
            <c:if test="${not empty faculties}">
                <c:forEach items="${faculties}" var="faculty">
                    ${faculty.facultyName} | ${faculty.id} <br>
                </c:forEach>
            </c:if>
        </form>

        <!-- Request Two -->
        <form action="/two" method="post">
            <input type="submit" value="Two">
        </form>

        <!-- Request Three -->
        <form action="/three" method="get">
            <input type="submit" value="Three">
        </form>

        <!-- Request Four -->
        <form action="/four" method="post">
            <input type="submit" value="Four">
        </form>

        <!-- Request Five -->
        <form action="/five" method="post" >
            <input type="submit" value="Five">
        </form>


        <div class="modal-footer" align="left">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
