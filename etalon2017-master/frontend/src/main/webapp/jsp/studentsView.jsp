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
        <jsp:param name="heading" value="Welcome on Student panel" />
    </jsp:include>
</div>

</body>
</html>
