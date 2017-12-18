package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.entities.StudentEntity;
import com.assignstudent.etalon.services.StudentService;
import com.assignstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping ("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    private ConversionService conversionService;


    private StudentRepository studentRepository;

    @RequestMapping (value = "/showAll", method = RequestMethod.GET)
    public ModelAndView printAllStudents(){
        ModelAndView studentViewModel=new ModelAndView();
        List<StudentEntity> studentEntityList= studentService.getAllStudents();
        studentViewModel.addObject("students", studentEntityList);
        studentViewModel.setViewName("systemStudentPanelView");
        return studentViewModel;
    }

    @RequestMapping (value = "/show/{id}", method = RequestMethod.GET)
    public ModelAndView printOneStudent(@PathVariable("id")int id){
        ModelAndView studentViewModel=new ModelAndView();
        StudentEntity studentEntity=studentService.getOneStudent(id);
        studentViewModel.addObject("student", studentEntity);
        studentViewModel.setViewName("studentsView");
        return studentViewModel;
    }
}
