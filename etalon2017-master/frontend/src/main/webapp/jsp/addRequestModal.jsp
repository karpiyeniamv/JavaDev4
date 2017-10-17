<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 16.10.2017
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="addRequestModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title"  align="center">Add request</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="email">Company name</label>
                        <input type="email" class="form-control" id="email">
                    </div>
                    <div class="form-group" >
                        <div style="display: inline-block">
                            <label for="pwd">date from</label>
                            <input type="password" class="form-control" id="pwd" >
                        </div>
                        <div style="display: inline-block">
                            <label for="pwd">date to</label>
                            <input type="password" class="form-control" id="pwd1" >
                        </div>
                    </div>
                    <div class="form-group">
                        <div style="display: inline-block">
                            <label for="pwd">quantity</label>
                            <input type="password" class="form-control" id="pwd2" >
                        </div>
                        <div style="display: inline-block">
                            <label for="pwd">available faculties</label>
                            <input type="password" class="form-control" id="pwd3" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email">available specialities</label>
                        <input type="email" class="form-control" id="email1">
                    </div>
                    <div class="form-group">
                        <label for="email">minimum average score</label>
                        <input type="email" class="form-control" id="email2">
                    </div>


                    <div class="checkbox">
                        <label><input type="checkbox"> Remember me</label>
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
