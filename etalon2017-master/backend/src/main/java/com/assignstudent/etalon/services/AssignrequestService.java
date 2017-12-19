package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.AssignrequestEntity;

import java.util.List;

public interface AssignrequestService {
    void createAssignRequest( AssignrequestEntity assignrequestEntity);
    List<AssignrequestEntity> getAllAssignrequests();
}
