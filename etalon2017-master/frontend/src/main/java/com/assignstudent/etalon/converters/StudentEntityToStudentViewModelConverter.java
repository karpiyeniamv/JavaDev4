package com.assignstudent.etalon.converters;

import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.beans.SpecialtyViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import com.assignstudent.etalon.entities.StudentEntity;
import com.assignstudent.etalon.beans.StudentViewModel;


public class StudentEntityToStudentViewModelConverter implements Converter<StudentEntity, StudentViewModel> {
    @Autowired
    private ConversionService conversionService;

    @Override
    public StudentViewModel convert (StudentEntity studentEntity){
        StudentViewModel studentViewModel= new StudentViewModel();
        studentViewModel.setId(studentEntity.getId());
        studentViewModel.setFirstName(studentEntity.getFirstName());
        studentViewModel.setLastName(studentEntity.getLastName());
        studentViewModel.setScore(studentEntity.getScore());
        studentViewModel.setStatus(studentEntity.getStatus());
        studentViewModel.setFacultyByFacultyId(conversionService.convert(studentEntity.getFacultyByFacultyId(), FacultyViewModel.class));
        studentViewModel.setSpecialtyBySpecialtyId(conversionService.convert(studentEntity.getSpecialtyBySpecialtyId(), SpecialtyViewModel.class));
        return studentViewModel;
    }
}
