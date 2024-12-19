package com.example.student_laptop_mapping.controller;


import com.example.student_laptop_mapping.entity.Student;
import com.example.student_laptop_mapping.service.StudentLaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentLaptopController {

    @Autowired
    StudentLaptopService studentLaptopService;


    @PostMapping("/savestudentlaptop/onetoone")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {

        return new ResponseEntity<>(studentLaptopService.saveStudentLaptopOneToOne(student), HttpStatus.ACCEPTED);


    }

    @PostMapping("/getstudent/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id)
    {
        return new ResponseEntity<>(studentLaptopService.getStudent(id), HttpStatus.ACCEPTED);

    }




}
