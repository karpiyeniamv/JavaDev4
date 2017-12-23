package com.assignstudent.repository;

import com.assignstudent.etalon.entities.RequestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RequestRepository extends  CrudRepository <RequestEntity, Integer>{

    @Query(value = "select r.id, c.companyName, r.dateFrom, r.dateTo, f.facultyName , s.specialtyName , r.score,r.quantity, (r.quantity - count(*)) from request r left join assignrequest a on r.id=a.requestId left join company c on r.companyId=c.id left join faculty f on r.facultyId=f.id left join specialty s on r.specialtyId=s.id group by r.id", nativeQuery = true)
    List<Object[]> getAllRequestsWithAvailableQuantity();
}
