package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.CompanyDao;
import com.assignstudent.etalon.entities.CompanyEntity;

public class CompanyDaoImpl extends GenericDaoImpl<CompanyEntity, Integer> implements CompanyDao {
    public CompanyDaoImpl() {super(CompanyEntity.class);}
}
