
$(document).ready(function () {
    var ELEMENTS = {

        DELETE_STUDENT_BUTTON: '.jsDeleteStudent',
        RELEASE_STUDENT_BUTTON: '.jsReleaseStudent'
    };
    var $deleteStudentBtn = $(ELEMENTS.DELETE_STUDENT_BUTTON);
    $deleteStudentBtn.click(function() {
        var chkArray = new Array();
        getValueUsingClass(chkArray);
        $.ajax({
            url: '/students/delete',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(  chkArray ),
            success: function (xhr) {
                alert('Students were deleted');
                //$specialtyName.val('');

            },
            error: function (xhr, textStatus) {
                alert('Something went wrong, try again later.');

            },
            dataType: "json",
            cash: false
        });
        if(chkArray.length > 0){
            alert("You delete " + chkArray.length+" students");
        }else{
            alert("Please at least one of the checkbox");
        }

    });

    var $releaseStudentBtn = $(ELEMENTS.RELEASE_STUDENT_BUTTON);
    $releaseStudentBtn.click(function() {
        var chkArray = new Array();
        getValueUsingClass(chkArray);
        $.ajax({
            url: '/assignrequest/release',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(  chkArray ),
            success: function (xhr) {
                alert('Students were released');
                //$specialtyName.val('');
            },
            error: function (xhr, textStatus) {
                alert('Something went wrong, try again later.');
            },
            dataType: "json",
            cash: false
        });
        if(chkArray.length > 0){
            alert("You release " + chkArray.length+" students");
        }else{
            alert("Please at least one of the checkbox");
        }

    });


    function getValueUsingClass(chkArray){

    $(".chk:checked").each(function() {
        chkArray.push($(this).val());
    });
    }

});