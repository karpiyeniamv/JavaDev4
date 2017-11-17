package com.assignstudent.etalon.repository;

import com.assignstudent.etalon.entities.FacultyEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface FacultyRepository extends  CrudRepository <FacultyEntity, Integer>{
}
