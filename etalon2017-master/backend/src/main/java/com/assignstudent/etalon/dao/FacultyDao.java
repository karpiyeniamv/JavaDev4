package com.assignstudent.etalon.dao;

import com.assignstudent.etalon.entities.FacultyEntity;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface FacultyDao extends GenericDao<FacultyEntity, Integer>{
    public List<FacultyEntity> getListFacultyEntity();

}
