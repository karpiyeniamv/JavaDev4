package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.RequestEntity;
import org.springframework.stereotype.Repository;


public interface RequestRepository extends  CrudRepository <RequestEntity, Integer>{
}
