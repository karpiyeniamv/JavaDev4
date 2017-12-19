package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.CompanyEntity;
import com.assignstudent.etalon.services.CompanyService;
import com.assignstudent.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    @Override
    public List<CompanyEntity> getAllCompanies() {
        return (List<CompanyEntity> ) companyRepository.findAll();
    }

    @Override
    public CompanyEntity findById(int id) {
        return companyRepository.findOne(id);
    }
}
