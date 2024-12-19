package com.example.student_laptop_mapping.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    private  Integer lId;
    private String lName;
    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "rollNo") // it is child entity since it has the foreign key
    @JsonBackReference //  to ignore serilization in child entity
    private  Student student;

    public Laptop(Integer lId, String lName, Student student) {
        this.lId = lId;
        this.lName = lName;
        this.student = student;
    }

    public Laptop() {
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
