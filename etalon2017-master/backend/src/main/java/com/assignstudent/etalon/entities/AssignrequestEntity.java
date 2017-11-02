package com.assignstudent.etalon.entities;

import javax.persistence.*;

@Entity
@Table(name = "assignrequest", schema = "assignstudent", catalog = "")
public class AssignrequestEntity {
    private int id;
    private int requestId;
    private int studentId;
    private RequestEntity requestByRequestId;
    private StudentEntity studentByStudentId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "requestId", nullable = false)
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "studentId", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssignrequestEntity that = (AssignrequestEntity) o;

        if (id != that.id) return false;
        if (requestId != that.requestId) return false;
        if (studentId != that.studentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + requestId;
        result = 31 * result + studentId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "requestId", referencedColumnName = "id", nullable = false)
    public RequestEntity getRequestByRequestId() {
        return requestByRequestId;
    }

    public void setRequestByRequestId(RequestEntity requestByRequestId) {
        this.requestByRequestId = requestByRequestId;
    }

    @ManyToOne
    @JoinColumn(name = "studentId", referencedColumnName = "id", nullable = false)
    public StudentEntity getStudentByStudentId() {
        return studentByStudentId;
    }

    public void setStudentByStudentId(StudentEntity studentByStudentId) {
        this.studentByStudentId = studentByStudentId;
    }
}
