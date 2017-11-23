package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.FacultyDao;
import com.assignstudent.etalon.entities.FacultyEntity;
import org.hibernate.Query;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class FacultyDaoImpl extends GenericDaoImpl<FacultyEntity, Integer> implements FacultyDao {
    public FacultyDaoImpl () {super(FacultyEntity.class);}

    @Override
    public List<FacultyEntity> getListFacultyEntity() {

        Query query = getCurrentSession().createSQLQuery("select id,facultyName from  faculty ");
        List<Object[]> rows = query.list();
        List<FacultyEntity> facultyEntityList = new ArrayList<FacultyEntity>();
        for(Object[] row : rows){
            facultyEntityList.add(new FacultyEntity(Integer.parseInt(row[0].toString()), row[1].toString()));
        }
        return facultyEntityList;
    }
}
