package com.example.tcd.controller;

import com.example.tcd.model.Student;
import com.example.tcd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }
}
