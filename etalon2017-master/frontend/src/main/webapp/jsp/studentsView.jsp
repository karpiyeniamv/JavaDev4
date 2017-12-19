<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="${pageContext.request.contextPath}/resources/js/libs/bootstrap-3.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/libs/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/libs/jquery.min.js"></script>
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
<form action="/students/show/${student.id}" method="get">
<table border="0" class="table" id="table-lizing-traktor">


    <tr>
        <td>First Name</td> <td>${student.firstName}</td>
        <td>Last Name</td> <td>${student.lastName}</td>
    </tr>
    <tr>
        <td>Faculty</td><td>${student.facultyByFacultyId.facultyName}</td>
        <td>Specialty</td><td>${student.specialtyBySpecialtyId.specialtyName}</td>
    </tr>
    <tr>
        <td>Group</td><td>${student.group}</td>
        <td>Is Budget</td>
        <c:choose>
        <c:when test = "${student.isBudget <= 0}">
            <td>False</td>
        </c:when>
        <c:when test = "${student.isBudget > 0}">
            <td>True</td>
        </c:when>
        <c:otherwise>
            <td></td>
        </c:otherwise>
    </c:choose>
    </tr>
    <tr>
        <td>Practice date from</td><td></td>
        <td>Practice date to</td><td></td>
    </tr>
    <tr>
        <td>Average score</td><td>${student.score}</td>
        <td>Comments</td>
    </tr>

    <%--<script>--%>
       <%--studentsView();--%>
    <%--</script>--%>
</table>
</form>

<jsp:include page="/jsp/assignStudentsModal.jsp"/>
<jsp:include page="/jsp/releaseStudentModal.jsp"/>

<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign</button>
&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#releaseStudentModal" >Release</button>

</body>
</html>
