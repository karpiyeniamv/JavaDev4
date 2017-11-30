package com.assignstudent.repository;

import com.assignstudent.etalon.entities.RequestEntity;
import org.springframework.data.repository.CrudRepository;


public interface RequestRepository extends  CrudRepository <RequestEntity, Integer>{
}
