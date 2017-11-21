package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.SpecialtyDao;
import com.assignstudent.etalon.entities.SpecialtyEntity;

public class SpecialtyDaoImpl extends GenericDaoImpl<SpecialtyEntity,Integer> implements SpecialtyDao{
    public SpecialtyDaoImpl (){
        super(SpecialtyEntity.class);
    }
}
