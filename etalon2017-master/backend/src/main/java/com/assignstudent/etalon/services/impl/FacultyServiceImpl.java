package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.dao.FacultyDao;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.repository.FacultyRepository;
import com.assignstudent.etalon.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@Repository
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    @Qualifier ("facultyDao")
    private FacultyDao facultyDao;

    public FacultyDao getFacultyDao() {return facultyDao;}


   // private FacultyRepository facultyRepository;

    @Transactional
    @Override
    public List<FacultyEntity> getAllFaculties() {
        return getFacultyDao().getAll();
    }
}
