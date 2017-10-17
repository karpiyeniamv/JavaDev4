<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="createStudentModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title"  align="center">Create student</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                    <div class="form-group" style="display: inline-block">
                        <label for="lastName">Last name</label>
                        <input type="text" class="form-control" id="lastName">
                    </div>
                    <div class="form-group" style="display: inline-block">
                        <label for="firstName">First name</label>
                        <input type="text" class="form-control" id="firstName">
                    </div>
                </form>
                <form>
                    <div class="form-group" style="display: inline-block">
                        <label for="faculty">Faculty</label>
                        <input type="text" class="form-control" id="faculty">
                    </div>
                    <div class="form-group" style="display: inline-block">
                        <label for="specialty">Specialty</label>
                        <input type="text" class="form-control" id="specialty">
                    </div>
                </form>
                <form>
                    <div class="form-group" >
                        <label for="group">Group</label>
                        <input type="text" class="form-control" id="group">
                    </div>
                    <div class="form-group" >
                        <label for="isBudget">Is budget?</label>
                        <input type="text" class="form-control" id="isBudget">
                    </div>
                    <div class="form-group" >
                        <label for="score">Average score</label>
                        <input type="number" step="0.1" class="form-control" id="score">
                    </div>
                    <div class="form-group" >
                        <label for="demands">Available demands</label>
                        <input type="text" class="form-control" id="demands">
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
