$(document).ready(function () {

    var ELEMENTS = {
        DATA_FROM: '.dateFrom',
        DATA_TO: '.dateTo',
        QUANTITY: '.quantity',
        SCORE: '.score',
        CREATE_REQUEST_BUTTON: '.jsCreateRequest',
        CLOSE_BUTTON: '.close'
    };

    var $createRequestBtn = $(ELEMENTS.CREATE_REQUEST_BUTTON),
        $closeBtn=$(ELEMENTS.CLOSE_BUTTON),
        $dataFrom=$(ELEMENTS.DATA_FROM),
        $dataTo=$(ELEMENTS.DATA_TO),
        $quantity=$(ELEMENTS.QUANTITY),
        $score=$(ELEMENTS.SCORE)

    $createRequestBtn.click(function (event) {
        event.stopPropagation();

        selectCompanyId=document.getElementById("jsCompanyId");
        valueCompanyId=selectCompanyId.options[selectCompanyId.selectedIndex].value;

        selectFacultyId = document.getElementById("jsFacultyId"); // Выбираем  select по id
        valueFacultyId = selectFacultyId.options[selectFacultyId.selectedIndex].value; // Значение value для выбранного option

        selectSpecialtyId = document.getElementById("jsSpecialtyId"); // Выбираем  select по id
        valueSpecialtyId = selectSpecialtyId.options[selectSpecialtyId.selectedIndex].value;
        //text = select.options[select.selectedIndex].text; // Текстовое значение для выбранного option
        //alert("Value: " + value + "\nТекст: " + text);
        $.ajax({
            url: '/request/create',
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify({
                dateFrom: $dataFrom.val(),
                dateTo: $dataTo.val(),
                quantity: $quantity.val(),
                score: $score.val(),
                companyByCompanyId:valueCompanyId,
                facultyByFacultyId:valueFacultyId,
                specialtyBySpecialtyId:valueSpecialtyId
            }),
            success: function (xhr) {
                alert('Request was created');
                $specialtyName.val('');

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