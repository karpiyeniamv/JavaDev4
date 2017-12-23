package com.assignstudent.repository;

import com.assignstudent.etalon.entities.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface StudentRepository extends  CrudRepository <StudentEntity, Integer>{

//    @Query("SELECT * FROM student a  LEFT JOIN assignrequest b ON a.id=b.studentId")
//    public List<?> FindAllWithAssignRequest();

//    @Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
//    public List<Person> find(@Param("lastName") String lastName);

//    @PersistenceContext
//    protected EntityManager entityManager;
//
//    @SuppressWarnings("unchecked")
//    public List<?> readByAssign() {
//        return this.entityManager.createQuery("select * from student e left join assignrequest h on e.id=h.studentidAssign").
//                getResultList();
//    }
//@Query("Select a from Beds b left join Allocations a on a.beds.bedID = b.bedId ")
//public List<StudentEntity> findtest();
//@Query("select u from User u")
//Stream<StudentEntity> findAllByCustomQueryAndStream();

    @Query(value = "SELECT A.id, A.firstName as firstName,A.lastName as lastName, F.facultyName as facultyName, S.specialtyName, A.group, A.score, A.isBudget, A.status, D.companyName, C.datefrom, C.dateTo FROM (STUDENT A LEFT JOIN ASSIGNREQUEST B ON A.id=B.studentId) LEFT JOIN FACULTY F ON A.facultyId=F.id LEFT JOIN SPECIALTY S ON A.specialtyId=S.id  LEFT JOIN REQUEST C ON B.requestId=C.id LEFT JOIN COMPANY D ON C.companyId=D.id", nativeQuery = true)
    List<Object[]> findWithRequests();


}
