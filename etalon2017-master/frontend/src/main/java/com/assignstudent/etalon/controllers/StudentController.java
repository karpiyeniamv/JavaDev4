package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.StudentViewModel;
import com.assignstudent.etalon.entities.StudentEntity;
import com.assignstudent.etalon.repository.StudentRepository;
import com.assignstudent.etalon.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping ("/students")
public class StudentController {

//    @Autowired
//    private ConversionService conversionService;
//    @Autowired
//    private StudentService studentService;
//    @Autowired
//    private StudentRepository studentRepository;
//    @RequestMapping (value = "/showAll", method = RequestMethod.GET)
//    public List<StudentViewModel> goToAllStudents (){
//       List<StudentEntity> studentEntities = studentRepository.getA;
//       return null;
//
//    }
}
