package com.assignstudent.repository;

import com.assignstudent.etalon.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;


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
}
