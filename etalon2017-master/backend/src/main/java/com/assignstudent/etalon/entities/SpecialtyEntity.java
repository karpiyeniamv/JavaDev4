package com.assignstudent.etalon.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "specialty", schema = "assignstudent", catalog = "")
public class SpecialtyEntity {
    private int id;
    private String specialtyName;
    private int facultyId;
    private FacultyEntity facultyByFacultyId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "specialtyName", nullable = false, length = 45)
    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    @Basic
    @Column(name = "facultyId", nullable = false)
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
    @JoinColumn(name = "facultyId", referencedColumnName = "id", nullable = false,insertable=false, updatable=false)
    public FacultyEntity getFacultyByFacultyId() {
        return facultyByFacultyId;
    }

    public void setFacultyByFacultyId(FacultyEntity facultyByFacultyId) {
        this.facultyByFacultyId = facultyByFacultyId;
    }
}
