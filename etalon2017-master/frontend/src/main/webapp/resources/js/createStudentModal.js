$(document).ready(function () {

    var ELEMENTS = {
        LAST_NAME: '.lastName',
        FIRST_NAME: '.firstName',
        GROUP: '.mgroup',
        SCORE: '.mscore',
        CREATE_STUDENT_BUTTON: '.jsCreateStudent',
        CLOSE_BUTTON: '.close'
    };

    var $createStudentBtn = $(ELEMENTS.CREATE_STUDENT_BUTTON),
        $closeBtn=$(ELEMENTS.CLOSE_BUTTON),
        $group=$(ELEMENTS.GROUP),
        $score=$(ELEMENTS.SCORE),
        $lastName=$(ELEMENTS.LAST_NAME),
        $firstName=$(ELEMENTS.FIRST_NAME);

    $createStudentBtn.click(function (event) {
        event.stopPropagation();

        selectMFacultyId = document.getElementById("jsMFacultyId"); // Выбираем  select по id
        valueMFacultyId = selectMFacultyId.options[selectMFacultyId.selectedIndex].value; // Значение value для выбранного option

        selectMSpecialtyId = document.getElementById("jsMSpecialtyId"); // Выбираем  select по id
        valueMSpecialtyId = selectMSpecialtyId.options[selectMSpecialtyId.selectedIndex].value;

        selectMRequestId = document.getElementById("jsMRequestId"); // Выбираем  select по id
        valueMRequestId = selectMRequestId.options[selectMRequestId.selectedIndex].value;

        selectMIsBudgetId=document.getElementById("jsMIsBudgetId");
        valueMIsBudgetId=selectMIsBudgetId.options[selectMIsBudgetId.selectedIndex].value;

        //text = select.options[select.selectedIndex].text; // Текстовое значение для выбранного option
        //alert("Value: " + value + "\nТекст: " + text);
        $.ajax({
            url: '/students/create',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify({
                firstName: $firstName.val(),
                lastName: $lastName.val(),
                score: $score.val(),
                status:'0',
                isBudget:valueMIsBudgetId,
                group: $group.val(),
                facultyByFacultyId:valueMFacultyId,
                specialtyBySpecialtyId:valueMSpecialtyId
            }),
            success: function (xhr) {
                alert('Student was created');
                //$specialtyName.val('');

            },
            error: function (xhr, textStatus) {
                //alert($firstName.val()+' '+$lastName.val()+' '+$score.val()+' '+valueMIsBudgetId+' '+$group.val()+' '+valueMFacultyId+' '+valueMSpecialtyId);
                alert('Something went wrong, try again later.');

            },
            dataType: "json",
            cash: false
        });

        //alert($('#jsFacultyId').val());
        $closeBtn.click();


    })

});