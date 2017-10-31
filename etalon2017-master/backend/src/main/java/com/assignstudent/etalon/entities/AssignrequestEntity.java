package com.assignstudent.etalon.entities;

import javax.persistence.*;

@Entity
@Table(name = "assignrequest", schema = "assignstudent", catalog = "")
public class AssignrequestEntity {
    private int requestId;
    private int sudentId;
    private RequestEntity requestByRequestId;
    private StudentEntity studentBySudentId;

    @Basic
    @Column(name = "requestId", nullable = false)
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "sudentId", nullable = false)
    public int getSudentId() {
        return sudentId;
    }

    public void setSudentId(int sudentId) {
        this.sudentId = sudentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssignrequestEntity that = (AssignrequestEntity) o;

        if (requestId != that.requestId) return false;
        if (sudentId != that.sudentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requestId;
        result = 31 * result + sudentId;
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
    @JoinColumn(name = "sudentId", referencedColumnName = "id", nullable = false)
    public StudentEntity getStudentBySudentId() {
        return studentBySudentId;
    }

    public void setStudentBySudentId(StudentEntity studentBySudentId) {
        this.studentBySudentId = studentBySudentId;
    }
}
