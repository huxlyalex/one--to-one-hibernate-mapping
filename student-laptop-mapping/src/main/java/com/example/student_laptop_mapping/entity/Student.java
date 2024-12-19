package com.example.student_laptop_mapping.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private Integer rollNo;
    private String name;
    private  Integer mark;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)// this entity has CascadeType.ALL,since it is parent entity
    @JsonManagedReference
    private Laptop laptop;
    public Student(Integer rollNo, String name, Integer mark, Laptop laptop) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
        this.laptop = laptop;
    }

    public Student() {
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
