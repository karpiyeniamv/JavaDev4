package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.beans.SpecialtyViewModel;
import com.assignstudent.etalon.beans.StudentViewModel;
import com.assignstudent.etalon.converters.FacultyEntityToFacultyViewModelConverter;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.repository.FacultyRepository;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.etalon.services.impl.FacultyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping ("/faculty")
public class FacultyController {


    @Autowired
    FacultyService facultyService;


    private FacultyRepository facultyRepository;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView printWelcome(){
        ModelAndView facultyViewModel=new ModelAndView();
        FacultyEntity facultyEntity=new FacultyEntity();
        facultyEntity.setFacultyName("BIO");
        facultyViewModel.addObject("faculty", facultyEntity);
        facultyViewModel.setViewName("page");
        return facultyViewModel;
    }

    @RequestMapping(value = "/listFaculties", method = RequestMethod.GET)
    public ModelAndView printAllFaculties(){
        ModelAndView facultyViewModel=new ModelAndView();
       List<FacultyEntity> facultyEntityList=facultyService.getAllFaculties();
       facultyViewModel.addObject("list", facultyEntityList);
       facultyViewModel.setViewName("listFaculties");
        return facultyViewModel;
    }

//    public FacultyController (FacultyRepository facultyRepository){
//        this.facultyRepository=facultyRepository;
//    }

//    @GetMapping(path="/faculties")
//    public @ResponseBody Iterable<FacultyEntity> getVisits() {
//        return facultyRepository.findAll();
//    }

//  w
//    @RequestMapping(value = "/faculties", method = RequestMethod.GET)
//
//    public List<SpecialtyViewModel> getAllFaculties() {
//        List<FacultyEntity> allFaculties = facultyService.getAllFaculties();
//        return (List<SpecialtyViewModel>) conversionService.convert(allFaculties, facultyEntityTypeDescriptor, facultyViewModelTypeDescriptor);
//    }
}

