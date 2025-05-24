package com.example.ApiSpringBoot.controllers;

import com.example.ApiSpringBoot.modelos.Student;
import com.example.ApiSpringBoot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteById(id);
    }
}
