package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.CompanyEntity;


public interface CompanyRepository extends  CrudRepository <CompanyEntity, Integer>{
}
