package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.services.RequestService;
import com.assignstudent.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    RequestRepository requestRepository;

    @Override
    public List<RequestEntity> getAllRequests() {
        return (List<RequestEntity>) requestRepository.findAll();
    }
}
