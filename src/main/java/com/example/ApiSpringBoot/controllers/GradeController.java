package com.example.ApiSpringBoot.controllers;

import com.example.ApiSpringBoot.modelos.Grade;
import com.example.ApiSpringBoot.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/grades")
@CrossOrigin("*")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeService.getAllGrades();
    }

    @GetMapping("/{id}")
    public Optional<Grade> getGradeById(@PathVariable Integer id) {
        return gradeService.getGradeById(id);
    }

    @PostMapping
    public Grade saveGrade(@RequestBody Grade grade) {
        return gradeService.saveGrade(grade);
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable Integer id) {
        gradeService.deleteGrade(id);
    }
}
