package com.assignstudent.etalon.entities;

import javax.persistence.*;

@Entity
@Table(name = "specialty", schema = "assignstudent", catalog = "")
public class SpecialtyEntity {
    private int id;
    private String specialtyName;
    private int facultyId;
    private FacultyEntity faculty;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "specialtyName")
    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    @Basic
    @Column(name = "facultyId")
    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialtyEntity that = (SpecialtyEntity) o;

        if (id != that.id) return false;
        if (facultyId != that.facultyId) return false;
        if (specialtyName != null ? !specialtyName.equals(that.specialtyName) : that.specialtyName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (specialtyName != null ? specialtyName.hashCode() : 0);
        result = 31 * result + facultyId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "facultyId", referencedColumnName = "id", nullable = false)
    public FacultyEntity getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyEntity faculty) {
        this.faculty = faculty;
    }
}
