package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.StudentEntity;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends  CrudRepository <StudentEntity, Integer>{
}
