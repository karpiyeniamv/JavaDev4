package com.assignstudent.etalon.repository;

import com.assignstudent.etalon.entities.FacultyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import static javafx.scene.input.KeyCode.T;


public interface FacultyRepository extends  CrudRepository <FacultyEntity, Integer>{
}

