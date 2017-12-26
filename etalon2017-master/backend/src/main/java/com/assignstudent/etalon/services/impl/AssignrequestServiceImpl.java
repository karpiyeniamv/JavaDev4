package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.AssignrequestEntity;
import com.assignstudent.etalon.services.AssignrequestService;
import com.assignstudent.repository.AssignrequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AssignrequestServiceImpl implements AssignrequestService {
    @Autowired
    AssignrequestRepository assignrequestRepository;
    @Override
    public void createAssignRequest(AssignrequestEntity assignrequestEntity) {
        assignrequestRepository.save(assignrequestEntity);

    }

    @Override
    public List<AssignrequestEntity> getAllAssignrequests() {
        return (List<AssignrequestEntity>) assignrequestRepository.findAll();
    }

    @Override
    public void deleteBystudenId(int i) {
        assignrequestRepository.deleteAssignrequestEntitiesByStudentId(i);
    }

    @Override
    public void deleteByrequestId(int i) {
        assignrequestRepository.deleteAssignrequestEntityByRequestId(i);
    }
}
