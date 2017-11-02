package com.assignstudent.etalon.beans;

public class StudentViewModel {
    private int id;
    private String firstName;
    private String lastName;
    private Integer score;
    private int status;
    private FacultyViewModel facultyByFacultyId;
    private SpecialtyViewModel specialtyBySpecialtyId;

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

    public FacultyViewModel getFacultyByFacultyId() {
        return facultyByFacultyId;
    }

    public void setFacultyByFacultyId(FacultyViewModel facultyByFacultyId) {
        this.facultyByFacultyId = facultyByFacultyId;
    }

    public SpecialtyViewModel getSpecialtyBySpecialtyId() {
        return specialtyBySpecialtyId;
    }

    public void setSpecialtyBySpecialtyId(SpecialtyViewModel specialtyBySpecialtyId) {
        this.specialtyBySpecialtyId = specialtyBySpecialtyId;
    }
}
