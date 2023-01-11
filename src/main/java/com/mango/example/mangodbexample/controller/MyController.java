package com.mango.example.mangodbexample.controller;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.mango.example.mangodbexample.model.Student;
import com.mango.example.mangodbexample.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Student save = this.studentRepo.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent() {
        return ResponseEntity.ok(this.studentRepo.findAll());
    }
}
