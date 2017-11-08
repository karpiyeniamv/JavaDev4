package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.beans.SpecialtyViewModel;
import com.assignstudent.etalon.beans.StudentViewModel;
import com.assignstudent.etalon.converters.FacultyEntityToFacultyViewModelConverter;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.etalon.services.impl.FacultyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private ConversionService conversionService;

    private final TypeDescriptor facultyEntityTypeDescriptor = TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(FacultyEntity.class));
    private final TypeDescriptor facultyViewModelTypeDescriptor = TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(FacultyViewModel.class));
    @RequestMapping(value = "/faculties", method = RequestMethod.GET)
    @ResponseBody
    public List<SpecialtyViewModel> getAllFaculties() {
        List<FacultyEntity> allFaculties = facultyService.getAllFaculties();
        return (List<SpecialtyViewModel>) conversionService.convert(allFaculties, facultyEntityTypeDescriptor, facultyViewModelTypeDescriptor);
    }
}

