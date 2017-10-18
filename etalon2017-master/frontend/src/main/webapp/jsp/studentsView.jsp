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
       studentsView();
    </script>
</table>

<jsp:include page="/jsp/assignStudentsModal.jsp"/>
<jsp:include page="/jsp/releaseStudentModal.jsp"/>

<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign</button>
&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#releaseStudentModal" >Release</button>

</body>
</html>
