package com.assignstudent.etalon.beans;

public class StudentViewModel {
    private int id;
    private String firstName;
    private String lastName;
    private Integer score;
    private int status;
    private Integer isBudget;
    private Integer group;
    private Integer facultyByFacultyId;
    private Integer specialtyBySpecialtyId;

    public Integer getIsBudget() {
        return isBudget;
    }

    public void setIsBudget(Integer isBudget) {
        this.isBudget = isBudget;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getFacultyByFacultyId() {
        return facultyByFacultyId;
    }

    public void setFacultyByFacultyId(Integer facultyByFacultyId) {
        this.facultyByFacultyId = facultyByFacultyId;
    }

    public Integer getSpecialtyBySpecialtyId() {
        return specialtyBySpecialtyId;
    }

    public void setSpecialtyBySpecialtyId(Integer specialtyBySpecialtyId) {
        this.specialtyBySpecialtyId = specialtyBySpecialtyId;
    }
}
