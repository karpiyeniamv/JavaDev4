package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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


    @RequestMapping(value = "/createSpecialtyModal", method = RequestMethod.GET)
    public ModelAndView printAllFaculties(){
        ModelAndView facultyViewModel=new ModelAndView();
       List<FacultyEntity> facultyEntityList= facultyService.getAllFaculties();
       facultyViewModel.addObject("faculties", facultyEntityList);
       facultyViewModel.setViewName("createSpecialtyModals");
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

