package com.assignstudent.etalon.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "faculty", schema = "assignstudent", catalog = "")
public class FacultyEntity {
    private int id;
    private String facultyName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "facultyName", nullable = false, length = 45)
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacultyEntity that = (FacultyEntity) o;

        if (id != that.id) return false;
        if (facultyName != null ? !facultyName.equals(that.facultyName) : that.facultyName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (facultyName != null ? facultyName.hashCode() : 0);
        return result;
    }

}
