package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.SpecialtyViewModel;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.entities.SpecialtyEntity;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.etalon.services.SpecialtyService;
import com.assignstudent.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/specialty")
public class SpecialtyController {
    @Autowired
    SpecialtyService specialtyService;
    @Autowired
    FacultyService facultyService;

    @Autowired
    private ConversionService conversionService;

    SpecialtyRepository specialtyRepository;


    @RequestMapping(value = "/create",produces = "application/json", method = RequestMethod.POST)
    public @ResponseBody
    SpecialtyEntity createFaculty(@RequestBody SpecialtyViewModel specialtyViewModel) {
        SpecialtyEntity specialtyEntity=new SpecialtyEntity();
        specialtyEntity.setSpecialtyName(specialtyViewModel.getSpecialtyName());
        specialtyEntity.setFacultyId(specialtyViewModel.getFacultyId());
        FacultyEntity facultyEntity=facultyService.findById(specialtyViewModel.getFacultyId());
        specialtyEntity.setFacultyByFacultyId(facultyEntity);
        List<SpecialtyEntity> specialtyEntityList=new ArrayList<>();
        specialtyEntityList.add(specialtyEntity);
       specialtyService.addSpecialty(specialtyEntityList);
        return specialtyEntity;
    }
}
