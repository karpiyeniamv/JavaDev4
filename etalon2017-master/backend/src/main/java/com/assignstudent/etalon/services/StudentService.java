package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.StudentEntity;

import java.util.List;

public interface StudentService  {
    List<StudentEntity> getAllStudents ();
    StudentEntity getOneStudent(int id);
    void createStudent(StudentEntity studentEntity);
    List<Object[]> getAllStudentsWithOwnQuery();
    void delete (int i);
}

