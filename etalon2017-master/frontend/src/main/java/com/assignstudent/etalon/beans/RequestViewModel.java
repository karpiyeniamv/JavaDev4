package com.assignstudent.etalon.beans;

import java.sql.Date;

public class RequestViewModel {
    private int id;
    private Date dateFrom;
    private Date dateTo;
    private int quantity;
    private Integer score;
    private CompanyViewModel companyByCompanyId;
    private FacultyViewModel facultyByFacultyId;
    private SpecialtyViewModel specialtyBySpecialtyId;

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

    public CompanyViewModel getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(CompanyViewModel companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
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
