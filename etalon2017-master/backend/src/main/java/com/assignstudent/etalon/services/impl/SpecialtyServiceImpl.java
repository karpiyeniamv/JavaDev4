package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.SpecialtyEntity;
import com.assignstudent.etalon.services.SpecialtyService;
import com.assignstudent.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class SpecialtyServiceImpl implements SpecialtyService{

    @Autowired
    SpecialtyRepository specialtyRepository;

    @Override
    public void addSpecialty(List<SpecialtyEntity> specialtyEntityList) {
        specialtyRepository.save(specialtyEntityList);
    }

    @Override
    public List<SpecialtyEntity> getAllSpecialties() {
        return (List<SpecialtyEntity>) specialtyRepository.findAll();
    }

    @Override
    public SpecialtyEntity findById(int id) {
        return specialtyRepository.findOne(id);
    }
}
