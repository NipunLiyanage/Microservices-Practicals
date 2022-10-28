package com.example.msdemo.controller;


import com.example.msdemo.model.Student;
import com.example.msdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String Welcome(){
        return"Hello from BandiX";
    }

    @RequestMapping(value="/student", method = RequestMethod.POST)
    public Student save (@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value="/student", method= RequestMethod.GET)
    public ResponseEntity<Optional<Student>> fetchStudent(@RequestParam int id){
        Optional<Student> student = studentService.fetchStudentById(id);
        if(student==null)
        {
            return ResponseEntity.notFound().build();
        }else{
           return ResponseEntity.ok().body(student);
        }
    }



}
