$(document).ready(function() {
    var ELEMENTS = {
        CREATE_ASSIGN_STUDENT_BUTTON: '.jsAssignStudent',
        CLOSE_BUTTON: '.close'
    };

    var $createAssignStudentBtn = $(ELEMENTS.CREATE_ASSIGN_STUDENT_BUTTON),
        $closeBtn = $(ELEMENTS.CLOSE_BUTTON);
    $createAssignStudentBtn.click(function (event) {
        event.stopPropagation();

        selectAStudentId = document.getElementById("jsAStudentId"); // Выбираем  select по id
        valueAStudentId = selectAStudentId.options[selectAStudentId.selectedIndex].value;

        selectARequestId = document.getElementById("jsARequestId"); // Выбираем  select по id
        valueARequestId = selectARequestId.options[selectARequestId.selectedIndex].value;
        //text = select.options[select.selectedIndex].text; // Текстовое значение для выбранного option
        //alert("Value: " + value + "\nТекст: " + text);
        $.ajax({
            url: '/assignrequest/create',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify({
                requestByRequestId: valueARequestId,
                studentByStudentId: valueAStudentId
            }),
            success: function (xhr) {
                alert('Assign was created');
                location.reload();
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