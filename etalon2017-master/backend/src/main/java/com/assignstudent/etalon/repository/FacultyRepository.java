package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.FacultyEntity;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends  CrudRepository <FacultyEntity, Integer>{
}
