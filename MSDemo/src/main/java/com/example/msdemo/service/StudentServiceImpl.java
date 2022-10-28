package com.example.msdemo.service;

import com.example.msdemo.model.Student;
import com.example.msdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    public Student save (Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> fetchStudentById(int id){
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()){
            return Optional.of(student.get());
        }
        return null;

    }
}
