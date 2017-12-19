package com.assignstudent.etalon.beans;

public class AssignrequestViewModel {
    private int id;
    private int requestByRequestId;
    private int studentByStudentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRequestByRequestId() {
        return requestByRequestId;
    }

    public void setRequestByRequestId(int requestByRequestId) {
        this.requestByRequestId = requestByRequestId;
    }

    public int getStudentByStudentId() {
        return studentByStudentId;
    }

    public void setStudentByStudentId(int studentByStudentId) {
        this.studentByStudentId = studentByStudentId;
    }
}
