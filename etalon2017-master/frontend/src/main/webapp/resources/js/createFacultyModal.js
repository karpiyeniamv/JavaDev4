
$(document).ready(function () {

    var ELEMENTS = {
        FACULTY_NAME: '.jsFacultyName',
        CREATE_FACULTY_BUTTON: '.jsCreateFaculty',
        CLOSE_BUTTON: '.close'
    };

    var $createFacultyBtn = $(ELEMENTS.CREATE_FACULTY_BUTTON),
        $facultyName = $(ELEMENTS.FACULTY_NAME),
        $closeBtn=$(ELEMENTS.CLOSE_BUTTON);

    // $facultyName.on('blur', function () {
    //     Validation.validateOnEmpty([$facultyName], [$createFacultyBtn]);
    // });

    $createFacultyBtn.click(function (event) {
        event.stopPropagation();
        $.ajax({
            url: '/faculty/create',
            type: 'POST',
            contentType: "application/json",
             data: JSON.stringify({
                 facultyName: $facultyName.val()
            }),
            success: function (xhr) {
                alert('Faculty was created');
                $facultyName.val('');

            },
            error: function (xhr, textStatus) {
                alert('Something went wrong, try again later.');

            },
            dataType: "json",
            cash: false
        });
        'systemStudentPanelView.jsp'.reload();
        $closeBtn.click();



    })

});
