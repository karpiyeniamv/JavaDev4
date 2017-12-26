package com.assignstudent.repository;

import com.assignstudent.etalon.entities.RequestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RequestRepository extends  CrudRepository <RequestEntity, Integer>{

    @Query(value = "select r.id, c.companyName, r.dateFrom, r.dateTo, f.facultyName , s.specialtyName , r.score,r.quantity, CAST((r.quantity - (CASE WHEN a.num is null THEN '0' ELSE a.num END))as UNSIGNED) from request r left join (select (ar.requestId) as requestId ,(count(*)) as num from  assignrequest ar group by ar.requestId)  as a on r.id=a.requestId left join company c on r.companyId=c.id left join faculty f on r.facultyId=f.id left join specialty s on r.specialtyId=s.id group by r.id", nativeQuery = true)
    List<Object[]> getAllRequestsWithAvailableQuantity();
}
