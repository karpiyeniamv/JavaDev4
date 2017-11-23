package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.SpecialtyEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SpecialtyRepository extends  CrudRepository <SpecialtyEntity, Integer>{
    List<SpecialtyEntity> findSpecialitiesByFaculty_Id(int facultyId);
}
