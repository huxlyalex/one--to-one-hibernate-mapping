package com.example.student_laptop_mapping.service;

import com.example.student_laptop_mapping.entity.Student;
import com.example.student_laptop_mapping.repository.StudentOneToOneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentLaptopServiceImp implements   StudentLaptopService{


    @Autowired
    StudentOneToOneRepository studentOneToOneRepository;


    @Override
    public Student saveStudentLaptopOneToOne(Student student) {
        return studentOneToOneRepository.save(student);
    }

    @Override
    public Student getStudent(Integer id) {
        return studentOneToOneRepository.findById(id).get();
    }


}
