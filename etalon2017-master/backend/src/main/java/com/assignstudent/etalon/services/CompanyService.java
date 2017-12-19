package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.CompanyEntity;

import java.util.List;

public interface CompanyService {
    List<CompanyEntity> getAllCompanies ();
    CompanyEntity findById(int id);
}
