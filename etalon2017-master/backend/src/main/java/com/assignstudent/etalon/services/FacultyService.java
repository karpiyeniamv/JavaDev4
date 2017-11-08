package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.FacultyEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface FacultyService {
    List <FacultyEntity> getAllFaculties ();
}
