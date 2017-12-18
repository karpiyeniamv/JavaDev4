$(document).ready(function () {

    var ELEMENTS = {
        SPECIALTY_NAME: '.jsSpecialtyName',
        FACULTY_ID:'.jsFacultyId',
        CREATE_SPACIALTY_BUTTON: '.jsCreateSpecialty',
        CLOSE_BUTTON: '.close'
    };

    var $createSpacialtyBtn = $(ELEMENTS.CREATE_SPACIALTY_BUTTON),
        $specialtyName = $(ELEMENTS.SPECIALTY_NAME),
        $facultyId=$(ELEMENTS.FACULTY_ID),
        $closeBtn=$(ELEMENTS.CLOSE_BUTTON);

    $createSpacialtyBtn.click(function (event) {
        event.stopPropagation();
        $.ajax({
            url: '/specialty/create',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify({
                specialtyName: $specialtyName.val(),
                facultyId: $facultyId.val()
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
        // $closeBtn.click();


    })

});