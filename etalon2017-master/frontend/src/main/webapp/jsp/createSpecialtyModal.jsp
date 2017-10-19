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
    <script src="${pageContext.request.contextPath}/resources/js/libs/bootstrap-3.min.js"></script>
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
                    <div class="form-group">
                        <label for="faculties">Available faculties</label>
                        <input type="text" class="form-control" id="faculties">
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
