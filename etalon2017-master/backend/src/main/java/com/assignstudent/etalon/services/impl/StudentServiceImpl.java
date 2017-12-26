package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.StudentEntity;
import com.assignstudent.etalon.services.StudentService;
import com.assignstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAllStudents() {
        return (List<StudentEntity>) studentRepository.findAll();
    }

    @Override
    public StudentEntity getOneStudent(int id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void createStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }


    public List<Object[]> getAllStudentsWithOwnQuery() {
        return studentRepository.findWithRequests();
    }

    @Override
    public void delete(int i) {
        studentRepository.delete(i);
    }
}

