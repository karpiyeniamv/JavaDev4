package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.RequestEntity;

import java.util.List;

public interface RequestService {
    List<RequestEntity> getAllRequests();
    void createRequest (RequestEntity requestEntity);
    RequestEntity findById (int id);
}
