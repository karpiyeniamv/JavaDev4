package com.assignstudent.etalon.beans;

public class AssignrequestViewModel {
    private int id;
    private RequestViewModel requestByRequestId;
    private StudentViewModel studentByStudentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RequestViewModel getRequestByRequestId() {
        return requestByRequestId;
    }

    public void setRequestByRequestId(RequestViewModel requestByRequestId) {
        this.requestByRequestId = requestByRequestId;
    }

    public StudentViewModel getStudentByStudentId() {
        return studentByStudentId;
    }

    public void setStudentByStudentId(StudentViewModel studentByStudentId) {
        this.studentByStudentId = studentByStudentId;
    }
}
