package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.AssignrequestDao;
import com.assignstudent.etalon.entities.AssignrequestEntity;

public class AssignrequestDaoImpl extends GenericDaoImpl<AssignrequestEntity, Integer> implements AssignrequestDao {
    public AssignrequestDaoImpl() {super(AssignrequestEntity.class);}
}
