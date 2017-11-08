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
                    <h2>Random Person Generator</h2>
                    <input type="submit" id="randomFaculty" value="Get Random Faculty" /><br/><br/>
                    <div id="facultyResponse"> </div>


                    <div>
                        <h3>Printing data using model and view</h3>
                        <div class="jsDataUsingModelAndView">
                            <c:if test="${not empty faculties}">
                                <c:forEach items="${faculties}" var="faculty">
                                    ${student.studentId} | ${student.username} | ${student.email}  <br>
                                </c:forEach>
                            </c:if>
                        </div>
                    </div>
                </form>
            </div>

            <div class="modal-footer" align="left">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
