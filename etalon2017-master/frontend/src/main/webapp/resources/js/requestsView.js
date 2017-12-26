$(document).ready(function () {

    $(".chkG").bind("change", function () {
        disableButtonsByCheckboxes();
    });

    $(".chk").bind("change", function () {
        disableButtonsByCheckboxes();
    });

    //    window.addEventListener("hashchange", function(e) {
    //     alert("location: " + document.location + ", state: " + JSON.stringify(event.state));
    // });

    var ELEMENTS = {
        DELETE_REQUEST_BUTTON: '.jsDeleteRequest',
        ASSIGN_STUDENT_BUTTON: '.jsAssignStudentBtn',
        EDIT_REQUEST_BUTTON: '.jsEditRequest'
    };

    var $deleteRequestBtn = $(ELEMENTS.DELETE_REQUEST_BUTTON);
    var $assignStudentBtn = $(ELEMENTS.ASSIGN_STUDENT_BUTTON);
    var $editRequestButton = $(ELEMENTS.EDIT_REQUEST_BUTTON);

    $deleteRequestBtn.click(function() {
        var chkRArray = new Array();
        getRValueUsingClass(chkRArray);
        $.ajax({
            url: '/request/deletePostRequest',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(chkRArray),
            success: function (xhr) {
                if(chkRArray.length > 0) {
                    alert('Requests were deleted');
                    location.reload();
                }
            },
            error: function (xhr, textStatus) {
                alert('Something went wrong, try again later.');

            },
            dataType: "json",
            cash: false
        });
        if(chkRArray.length > 0){
            alert("You delete " + chkRArray.length+" requests");
        }else{
            alert("Please at least one of the checkbox");
        }

    });

    // $assignStudentBtn.click(function() {
    //     var chkRArray = new Array();
    //     getRValueUsingClass(chkRArray);
    //
    //     $.ajax({
    //         url: '/request/deletePostRequest',
    //         type: 'POST',
    //         contentType: "application/json",
    //         data: JSON.stringify(chkRArray),
    //         success: function (xhr) {
    //             if(chkRArray.length > 0) {
    //                 alert('Requests were deleted');
    //                 location.reload();
    //             }
    //         },
    //         error: function (xhr, textStatus) {
    //             alert('Something went wrong, try again later.');
    //
    //         },
    //         dataType: "json",
    //         cash: false
    //     });
    //     if(chkRArray.length > 0){
    //         alert("You delete " + chkRArray.length+" requests");
    //     }else{
    //         alert("Please at least one of the checkbox");
    //     }
    //
    // });




    function getRValueUsingClass(chkRArray){

        $(".chk:checked").each(function() {
            chkRArray.push($(this).val());
        });
    }


    function disableButtonsByCheckboxes() {
        var chkArray = new Array();
        getRValueUsingClass(chkArray);
        if (chkArray.length > 1){
            document.getElementById("jsDeleteRequest").disabled=false;
            document.getElementById("jsEditRequest").disabled=true;
            document.getElementById("jsAssignStudentBtn").disabled=true;
        }
        else
            if(chkArray.length == 1)
        {
            document.getElementById("jsDeleteRequest").disabled=false;
            document.getElementById("jsEditRequest").disabled=false;
            document.getElementById("jsAssignStudentBtn").disabled=false;
        }
        else

            {
                document.getElementById("jsDeleteRequest").disabled=true;
                document.getElementById("jsEditRequest").disabled=true;
                document.getElementById("jsAssignStudentBtn").disabled=true;

            }
    }

});