package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.RequestDao;
import com.assignstudent.etalon.entities.RequestEntity;

public class RequestDaoImpl extends GenericDaoImpl<RequestEntity, Integer> implements RequestDao {
    public RequestDaoImpl () {super(RequestEntity.class);}
}
