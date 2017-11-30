package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.FacultyEntity;

import java.util.List;


public interface FacultyService {
    List<FacultyEntity> getAllFaculties ();
    FacultyEntity createFaculty( FacultyEntity facultyEntity);
}
