package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.entities.CompanyEntity;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.entities.SpecialtyEntity;
import com.assignstudent.etalon.services.CompanyService;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.etalon.services.RequestService;
import com.assignstudent.etalon.services.SpecialtyService;
import com.assignstudent.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/faculty")
public class FacultyController {


    @Autowired
    FacultyService facultyService;
    @Autowired
    SpecialtyService specialtyService;
    @Autowired
    CompanyService companyService;
    @Autowired
    RequestService requestService;

    @Autowired
    private ConversionService conversionService;


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

    @RequestMapping(value = "/create",produces = "application/json", method = RequestMethod.POST)
    public @ResponseBody FacultyEntity createFaculty(@RequestBody FacultyViewModel facultyViewModel) {
        FacultyEntity facultyEntity=new FacultyEntity();
        facultyEntity.setFacultyName(facultyViewModel.getFacultyName());
        List<FacultyEntity> facultyEntities = new ArrayList<>();
        facultyEntities.add(facultyEntity);
        facultyService.addFaculty(facultyEntities);
        return facultyEntity;
    }



    @RequestMapping(value = "/createSpecialtyModal", method = RequestMethod.GET)
    public ModelAndView printAllFaculties(){
        ModelAndView facultyViewModel=new ModelAndView();
       List<FacultyEntity> facultyEntityList= facultyService.getAllFaculties();
       facultyViewModel.addObject("faculties", facultyEntityList);
       facultyViewModel.setViewName("createSpecialtyModal");
       return facultyViewModel;
    }

    @RequestMapping(value = "/addRequestModal", method = RequestMethod.GET)
    public ModelAndView printAllCompaniesAndFacultiesAndSpecialties(){
        ModelAndView requestViewModel=new ModelAndView();
        List<CompanyEntity> companyEntityList=companyService.getAllCompanies();
        requestViewModel.addObject("companies",companyEntityList);
        List<FacultyEntity> facultyEntityList= facultyService.getAllFaculties();
        requestViewModel.addObject("faculties", facultyEntityList);
        List<SpecialtyEntity>specialtyEntityList=specialtyService.getAllSpecialties();
        requestViewModel.addObject("specialties", specialtyEntityList);
        requestViewModel.setViewName("addRequestModal");
        return requestViewModel;
    }

    @RequestMapping(value = "/createStudentModal", method = RequestMethod.GET)
    public ModelAndView printAllFacultiesAndSpecialtiesAndRequests(){
        ModelAndView studentViewModel=new ModelAndView();
        List<RequestEntity> requestEntityList=requestService.getAllRequests();
        studentViewModel.addObject("requests",requestEntityList);
        List<FacultyEntity> facultyEntityList= facultyService.getAllFaculties();
        studentViewModel.addObject("faculties", facultyEntityList);
        List<SpecialtyEntity>specialtyEntityList=specialtyService.getAllSpecialties();
        studentViewModel.addObject("specialties", specialtyEntityList);
        studentViewModel.setViewName("createStudentModal");
        return studentViewModel;
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

