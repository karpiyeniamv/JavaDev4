package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.CompanyEntity;
import org.springframework.stereotype.Repository;


public interface CompanyRepository extends  CrudRepository <CompanyEntity, Integer>{
}
