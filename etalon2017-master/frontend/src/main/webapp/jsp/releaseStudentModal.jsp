<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 18.10.2017
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/resources/js/libs/bootstrap-3.min.js"></script>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="releaseStudentModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" align="center">Release student</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group" style="display: inline-block">
                        <label >Student: </label>
                        <label> Ivan Ivanov</label>
                    </div>
                    <div class="form-group" style="display: inline-block" >
                        <!-- drop-down list of students -->
                        <label>Available requests</label>
                        <select multiple size="10" >
                            <option>IBA 10.10.2017-10.12.2017</option>
                            <option>Epam 01.08.2017-10.10.2017</option>
                            <option>Netcracker 01.04.2017-10.11.2017</option>
                            <option>Integral 01.09.2017-01.01.2018</option>
                        </select>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Release</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>


