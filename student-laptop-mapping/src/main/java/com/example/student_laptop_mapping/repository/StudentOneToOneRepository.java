package com.example.student_laptop_mapping.repository;

import com.example.student_laptop_mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentOneToOneRepository extends JpaRepository<Student,Integer> {
}
