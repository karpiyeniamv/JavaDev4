package com.assignstudent.repository;

import com.assignstudent.etalon.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;


public interface CompanyRepository extends  CrudRepository <CompanyEntity, Integer>{
}
