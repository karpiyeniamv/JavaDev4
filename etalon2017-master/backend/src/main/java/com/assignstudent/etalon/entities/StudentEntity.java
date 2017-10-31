package com.assignstudent.etalon.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "student", schema = "assignstudent", catalog = "")
public class StudentEntity {
    private int id;
    private String firstName;
    private String lastName;
    private Integer facultyId;
    private Integer specialtyId;
    private Integer score;
    private int status;
    private Collection<AssignrequestEntity> assignrequestsById;
    private FacultyEntity facultyByFacultyId;
    private SpecialtyEntity specialtyBySpecialtyId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstName", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "facultyId", nullable = true)
    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    @Basic
    @Column(name = "specialtyId", nullable = true)
    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    @Basic
    @Column(name = "score", nullable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (facultyId != null ? !facultyId.equals(that.facultyId) : that.facultyId != null) return false;
        if (specialtyId != null ? !specialtyId.equals(that.specialtyId) : that.specialtyId != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (facultyId != null ? facultyId.hashCode() : 0);
        result = 31 * result + (specialtyId != null ? specialtyId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }

    @OneToMany(mappedBy = "studentBySudentId")
    public Collection<AssignrequestEntity> getAssignrequestsById() {
        return assignrequestsById;
    }

    public void setAssignrequestsById(Collection<AssignrequestEntity> assignrequestsById) {
        this.assignrequestsById = assignrequestsById;
    }

    @ManyToOne
    @JoinColumn(name = "facultyId", referencedColumnName = "id")
    public FacultyEntity getFacultyByFacultyId() {
        return facultyByFacultyId;
    }

    public void setFacultyByFacultyId(FacultyEntity facultyByFacultyId) {
        this.facultyByFacultyId = facultyByFacultyId;
    }

    @ManyToOne
    @JoinColumn(name = "specialtyId", referencedColumnName = "id")
    public SpecialtyEntity getSpecialtyBySpecialtyId() {
        return specialtyBySpecialtyId;
    }

    public void setSpecialtyBySpecialtyId(SpecialtyEntity specialtyBySpecialtyId) {
        this.specialtyBySpecialtyId = specialtyBySpecialtyId;
    }
}
