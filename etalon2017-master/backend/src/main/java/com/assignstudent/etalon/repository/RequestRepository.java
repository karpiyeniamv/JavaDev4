package com.assignstudent.etalon.repository;

import org.springframework.data.repository.CrudRepository;
import com.assignstudent.etalon.entities.RequestEntity;

public interface RequestRepository extends  CrudRepository <RequestEntity, Integer>{
}
