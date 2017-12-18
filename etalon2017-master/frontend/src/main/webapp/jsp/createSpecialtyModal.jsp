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

                <form action="/faculty/createSpecialtyModal" method="get">
                    <div class="form-group" >
                        <label for="nameOfSpecialty">Name of specialty</label>
                        <input type="text" class="form-control jsSpecialtyName" id="nameOfSpecialty">

                    <%--<c:if test="${not empty faculties}">--%>
                        <%--<c:forEach items="${faculties}" var="faculty">--%>
                            <%--${faculty.facultyName} | ${faculty.id} <br>--%>
                        <%--</c:forEach>--%>
                    <%--</c:if>--%>
                        <br>
                        <label for="loc">Choose a faculty</label>
                        <select multiple size="2" class="form-control" id ="loc" name ="loc">
                            <c:forEach items="${faculties}" var="faculty">
                                <option value = "${faculty.facultyName}">${faculty.facultyName}</option>
                            </c:forEach>
                        </select>
                        <input type="hidden" value="${faculty.id}"class="jsFacultyId"/>


                    </div>
                </form>
            </div>
        <div class="modal-footer" align="left">
                <button type="button" class="btn btn-primary jsCreateSpecialty" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
