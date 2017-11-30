package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FacultyServiceImpl implements FacultyService {

//    @Autowired
//    @Qualifier ("facultyDao")
//    private FacultyDao facultyDao;
//
//    public FacultyDao getFacultyDao() {return facultyDao;}



    @Autowired
   private FacultyRepository facultyRepository;

    @Override
    public List<FacultyEntity> getAllFaculties() {
        return  (List<FacultyEntity>) facultyRepository.findAll();
                //  getFacultyDao().getAll();
    }

    @Override
    public FacultyEntity createFaculty(FacultyEntity facultyEntity) {
        return null;
    }
}
