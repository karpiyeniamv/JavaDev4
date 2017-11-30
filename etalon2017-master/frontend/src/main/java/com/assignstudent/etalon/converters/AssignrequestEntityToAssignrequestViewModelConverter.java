package com.assignstudent.etalon.converters;

import com.assignstudent.etalon.beans.AssignrequestViewModel;
import com.assignstudent.etalon.entities.AssignrequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;



public class AssignrequestEntityToAssignrequestViewModelConverter implements Converter<AssignrequestEntity, AssignrequestViewModel>{

    @Autowired
    private ConversionService conversionService;

    @Override
    public AssignrequestViewModel convert (AssignrequestEntity assignrequestEntity){
        AssignrequestViewModel assignrequestViewModel = new AssignrequestViewModel();
        assignrequestViewModel.setId(assignrequestEntity.getId());
        /*assignrequestViewModel.setRequestByRequestId(conversionService.convert(assignrequestEntity.getRequestByRequestId(), RequestViewModel.class));
        assignrequestViewModel.setStudentByStudentId(conversionService.convert(assignrequestEntity.getStudentByStudentId(), StudentViewModel.class));
        */return assignrequestViewModel;
    }
}
