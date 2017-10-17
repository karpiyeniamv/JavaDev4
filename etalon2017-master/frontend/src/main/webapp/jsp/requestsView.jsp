<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>System demands panel</title>
</head>
<body>
<jsp:include page="/jsp/blocks/header.jsp"/>

<div class="container">
    <jsp:include page="/jsp/blocks/title.jsp">
        <jsp:param name="heading" value="Welcome on System demands panel"/>
    </jsp:include>
</div>

<br>
<br>

<table class="table" id="table-lizing-traktor">
    <script>
        requestsView();
    </script>
</table>

<div align="center">
    <button type="button" class="btn btn-primary" style="width: 9%" data-toggle="modal"
            data-target="#assignStudentsModal">Assiqn student
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" style="width: 9%" data-toggle="modal" data-target="#addRequestModal">
        Edit
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" style="width: 9%">Delete</button>
</div>

<jsp:include page="/jsp/addRequestModal.jsp"/>
<jsp:include page="/jsp/assignStudentsModal.jsp"/>


</body>
</html>
