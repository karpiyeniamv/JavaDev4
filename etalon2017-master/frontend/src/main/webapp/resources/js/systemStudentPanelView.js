$(document).ready(function () {
    $(".chkG").bind("change", function () {
        disableButtonsByCheckboxes();
    });

    $(".chk").bind("change", function () {
        disableButtonsByCheckboxes();
    });
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
                if(chkArray.length > 0) {
                    alert('Students were deleted');
                    location.reload();
                }

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
                if(chkArray.length > 0) {

                    alert('Students were released');
                    location.reload();
                }

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

    function disableButtonsByCheckboxes() {
        var chkArray = new Array();
        getValueUsingClass(chkArray);
        if (chkArray.length > 0){
            document.getElementById("jsDeleteStudent").disabled=false;
            document.getElementById("jsAssignStudent").disabled=false;
            document.getElementById("jsReleaseStudent").disabled=false;
        }
        else
        {
            document.getElementById("jsDeleteStudent").disabled=true;
            document.getElementById("jsAssignStudent").disabled=true;
            document.getElementById("jsReleaseStudent").disabled=true;
        }
    }

});