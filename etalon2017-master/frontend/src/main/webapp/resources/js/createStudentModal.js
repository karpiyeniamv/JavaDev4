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
        selectMFacultyId = document.getElementById("jsMFacultyId");
        if (selectMFacultyId.options[selectMFacultyId.selectedIndex]==null){
            valueMFacultyId=null;
        }else {
            valueMFacultyId = selectMFacultyId.options[selectMFacultyId.selectedIndex].value;
        }
        selectMSpecialtyId = document.getElementById("jsMSpecialtyId");
        if(selectMSpecialtyId.options[selectMSpecialtyId.selectedIndex]==null){
            valueMSpecialtyId=null;
        }
        else {
            valueMSpecialtyId = selectMSpecialtyId.options[selectMSpecialtyId.selectedIndex].value;
        }
        selectMRequestId = document.getElementById("jsMRequestId");
        if(selectMRequestId.options[selectMRequestId.selectedIndex]==null){
            valueMRequestId=null;
        }
        else{
        valueMRequestId = selectMRequestId.options[selectMRequestId.selectedIndex].value;
        }
        selectMIsBudgetId=document.getElementById("jsMIsBudgetId");
        if(selectMIsBudgetId.options[selectMIsBudgetId.selectedIndex]==null){
            valueMIsBudgetId=null;
        }
        else
        {
        valueMIsBudgetId=selectMIsBudgetId.options[selectMIsBudgetId.selectedIndex].value;
        }
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
                location.reload();
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