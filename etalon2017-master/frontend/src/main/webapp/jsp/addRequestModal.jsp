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
                        <label for="companyName">Company name</label>
                        <input type="text" class="form-control" id="companyName">
                    </div>
                    <div class="form-group" >
                        <div style="display: inline-block">
                            <label for="dateFrom">date from</label>
                            <input type="date" class="form-control" id="dateFrom" >
                        </div>
                        <div style="display: inline-block">
                            <label for="dateTo">date to</label>
                            <input type="date" class="form-control" id="dateTo" >
                        </div>
                    </div>
                    <div class="form-group">
                        <div style="display: inline-block">
                            <label for="quantity">quantity</label>
                            <input type="text" class="form-control" id="quantity" >
                        </div>
                        <div style="display: inline-block">
                            <label for="faculties">available faculties</label>
                            <input type="text" class="form-control" id="faculties" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="specialities">available specialities</label>
                        <input type="text" class="form-control" id="specialities">
                    </div>
                    <div class="form-group">
                        <label for="score">minimum average score</label>
                        <input type="text" class="form-control" id="score">
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
