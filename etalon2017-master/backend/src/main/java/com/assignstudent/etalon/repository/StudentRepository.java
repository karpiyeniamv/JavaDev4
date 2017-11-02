package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.StudentEntity;

public interface StudentRepository extends  CrudRepository <StudentEntity, Integer>{
}
