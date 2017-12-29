package com.assignstudent.etalon.beans;

import java.sql.Date;

public class RequestViewModel {
    private int id;
    private String companyName;
    private Date dateFrom;
    private Date dateTo;
    private int quantity;
    private Integer score;
    private int facultyByFacultyId;
    private int specialtyBySpecialtyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getFacultyByFacultyId() {
        return facultyByFacultyId;
    }

    public void setFacultyByFacultyId(int facultyByFacultyId) {
        this.facultyByFacultyId = facultyByFacultyId;
    }

    public int getSpecialtyBySpecialtyId() {
        return specialtyBySpecialtyId;
    }

    public void setSpecialtyBySpecialtyId(int specialtyBySpecialtyId) {
        this.specialtyBySpecialtyId = specialtyBySpecialtyId;
    }
}
