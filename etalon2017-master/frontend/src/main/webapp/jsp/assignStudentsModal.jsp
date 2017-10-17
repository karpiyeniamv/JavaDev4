<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="assignStudentsModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title"  align="center">Assign students</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                    <div class="form-group" style="display: inline-block">
                        <label for="students">Search available students</label>
                        <input type="text" class="form-control" id="students">
                    </div>
                    <div class="form-group" style="display: inline-block">
                        <label for="demands">Search available demands</label>
                        <input type="text" class="form-control" id="demands">
                    </div>
                </form>
            </div>
            <p><select multiple size="5">
                <option>Чебурашка</option>
                <option>Крокодил Гена</option>
                <option>Шапокляк</option>
                <option>Крыса Лариса</option>
            </select></p>

            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>

