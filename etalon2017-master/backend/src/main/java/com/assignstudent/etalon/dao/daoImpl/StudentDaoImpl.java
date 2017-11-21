package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.StudentDao;
import com.assignstudent.etalon.entities.StudentEntity;

public class StudentDaoImpl extends GenericDaoImpl<StudentEntity, Integer> implements StudentDao {
    public  StudentDaoImpl() {
          super(StudentEntity.class);
    }
}
