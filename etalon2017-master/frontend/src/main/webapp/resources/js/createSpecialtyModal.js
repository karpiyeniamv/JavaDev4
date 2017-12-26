$(document).ready(function () {

    var ELEMENTS = {
        SPECIALTY_NAME: '.jsSpecialtyName',
        FACULTY_ID:'.jsFacultyId',
        CREATE_SPECIALTY_BUTTON: '.jsCreateSpecialty',
        CLOSE_BUTTON: '.close'
    };

    var $createSpecialtyBtn = $(ELEMENTS.CREATE_SPECIALTY_BUTTON),
        $specialtyName = $(ELEMENTS.SPECIALTY_NAME),
        $closeBtn=$(ELEMENTS.CLOSE_BUTTON)
        //$facultyId = $('#jsFacultyId');
        //$facultyId=$('#jsFacultyId').attr('selected', 'selected');

    $createSpecialtyBtn.click(function (event) {
        event.stopPropagation();
        select = document.getElementById("jsSFacultyId"); // Выбираем  select по id
        value = select.options[select.selectedIndex].value; // Значение value для выбранного option
        //text = select.options[select.selectedIndex].text; // Текстовое значение для выбранного option
        //alert("Value: " + value + "\nТекст: " + text);
        $.ajax({
            url: '/specialty/create',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify({
                specialtyName: $specialtyName.val(),
                facultyId: value
            }),
            success: function (xhr) {
                alert('Specialty was created');
                location.reload();

            },
            error: function (xhr, textStatus) {
                alert('Something went wrong, try again later.');

            },
            dataType: "json",
            cash: false
        });

        //alert($('#jsFacultyId').val());
         $closeBtn.click();


    })

});