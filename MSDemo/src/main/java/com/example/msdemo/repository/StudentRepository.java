package com.example.msdemo.repository;

import com.example.msdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface StudentRepository extends JpaRepository<Student, Integer> {


}
