package com.example.ApiSpringBoot.controllers;

import com.example.ApiSpringBoot.modelos.Teacher;
import com.example.ApiSpringBoot.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teachers")
@CrossOrigin(origins = "*")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getTeacherById(@PathVariable Integer id) {
        return teacherService.getTeacherById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Integer id) {
        teacherService.deleteTeacherById(id);
    }
}
