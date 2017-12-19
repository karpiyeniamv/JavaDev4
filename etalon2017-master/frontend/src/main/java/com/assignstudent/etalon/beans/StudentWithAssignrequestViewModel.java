package com.assignstudent.etalon.beans;

import java.sql.Date;

public class StudentWithAssignrequestViewModel {
    private int id;
    private String firstName;
    private String lastName;
    private Integer score;
    private int status;
    private Integer isBudget;
    private Integer group;
    private Integer facultyByFacultyId;
    private Integer specialtyBySpecialtyId;

    private Date dateFrom;
    private Date dateTo;

    private String companyName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentWithAssignrequestViewModel that = (StudentWithAssignrequestViewModel) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (isBudget != null ? !isBudget.equals(that.isBudget) : that.isBudget != null) return false;
        if (group != null ? !group.equals(that.group) : that.group != null) return false;
        if (facultyByFacultyId != null ? !facultyByFacultyId.equals(that.facultyByFacultyId) : that.facultyByFacultyId != null)
            return false;
        if (specialtyBySpecialtyId != null ? !specialtyBySpecialtyId.equals(that.specialtyBySpecialtyId) : that.specialtyBySpecialtyId != null)
            return false;
        if (dateFrom != null ? !dateFrom.equals(that.dateFrom) : that.dateFrom != null) return false;
        if (dateTo != null ? !dateTo.equals(that.dateTo) : that.dateTo != null) return false;
        return companyName != null ? companyName.equals(that.companyName) : that.companyName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (isBudget != null ? isBudget.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (facultyByFacultyId != null ? facultyByFacultyId.hashCode() : 0);
        result = 31 * result + (specialtyBySpecialtyId != null ? specialtyBySpecialtyId.hashCode() : 0);
        result = 31 * result + (dateFrom != null ? dateFrom.hashCode() : 0);
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        return result;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
