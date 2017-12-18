package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.SpecialtyEntity;
import com.assignstudent.etalon.services.SpecialtyService;
import com.assignstudent.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class SpecialtyServiceImpl implements SpecialtyService{

    @Autowired
    SpecialtyRepository specialtyRepository;

    @Override
    public void addSpecialty(SpecialtyEntity specialtyEntity) {
        specialtyRepository.save(specialtyEntity);
    }
}
