<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 17.10.2017
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--suppress BadExpressionStatementJS --%>
    <script type="text/javascript">
//        fetch("/faculties")
//            .then(function (response) {
//        return response.json();
//        })
//        .then(faculties => {
//            faculties.forEach(faculty => {
//            const el = document.createElement('li');
//        el.innerText = faculty.facultyName;
//
//        document.querySelector('#faculties').append(el);
//        });
//        });
    </script>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="createFacultyModal" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" align="center">Create faculty</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="nameOfFaculty">Name of faculty</label>
                        <input type="text" class="form-control" id="nameOfFaculty">
                    </div>
                </form>
            </div>

            <div class="modal-footer" align="left">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Create</button>
            </div>
        </div>
    </div>
</div>


</body>
</html>