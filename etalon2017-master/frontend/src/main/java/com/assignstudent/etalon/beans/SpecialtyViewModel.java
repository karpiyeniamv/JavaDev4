package com.assignstudent.etalon.beans;

public class SpecialtyViewModel {
    private int id;
    private String specialtyName;

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    private int facultyId;
    private FacultyViewModel facultyByFacultyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public FacultyViewModel getFacultyByFacultyId() {
        return facultyByFacultyId;
    }

    public void setFacultyByFacultyId(FacultyViewModel facultyByFacultyId) {
        this.facultyByFacultyId = facultyByFacultyId;
    }
}
