package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.repository.RequestRepository;
import com.assignstudent.etalon.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    RequestRepository requestRepository;
    @Override
    public List<RequestEntity> getRequests() {
        return (List<RequestEntity>) requestRepository.findAll();
    }
}
