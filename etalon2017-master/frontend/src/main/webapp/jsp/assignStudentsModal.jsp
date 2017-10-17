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
                <h4 class="modal-title" align="center">Assign students</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                    <div class="form-group" style="display: inline-block">
                        <label for="demands">Search demands</label>
                        <input type="text" class="form-control" id="demands" value="Company name" >
                        <button type="button" class="btn btn-primary" data-dismiss="modal" style="width: 40%">search</button>
                    </div>
                    <div class="form-group" style="display: inline-block" >
                        <!-- drop-down list of students -->
                        <label for="students">Search students</label>
                        <input type="text" class="form-control" id="students" >
                        <button type="button" class="btn btn-primary" data-dismiss="modal" style="width: 40%">add</button>
                    </div>

                </form>
                <form>
                    <div class="form-group" style="display: inline-block;width: 40%">
                        <textarea name="Text1" cols="20" rows="5"></textarea>
                    </div>
                    <div class="form-group" style="display: inline-block;width: 50%; align-content: center;">
                        <select multiple size="10" style="width: 90%">
                            <option>Ivanov</option>
                            <option>Minina</option>
                            <option>Petrov</option>
                            <option>Zinevich</option>
                        </select>
                    </div>
                </form>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>

