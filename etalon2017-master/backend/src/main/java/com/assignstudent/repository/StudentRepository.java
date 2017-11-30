package com.assignstudent.repository;

import com.assignstudent.etalon.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;





public interface StudentRepository extends  CrudRepository <StudentEntity, Integer>{
}
