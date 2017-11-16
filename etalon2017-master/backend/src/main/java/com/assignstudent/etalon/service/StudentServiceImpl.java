package com.assignstudent.etalon.service;

import com.assignstudent.etalon.entities.StudentEntity;
import com.assignstudent.etalon.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity findStudent(int id) {
        return studentRepository.findOne(id);
    }
}
