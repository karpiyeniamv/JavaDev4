package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.SpecialtyEntity;

import java.util.List;

public interface SpecialtyService {
    void addSpecialty(List<SpecialtyEntity> specialtyEntity);
    List<SpecialtyEntity> getAllSpecialties ();
    SpecialtyEntity findById (int id);
}
