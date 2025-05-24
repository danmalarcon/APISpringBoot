package com.example.ApiSpringBoot.controllers;

import com.example.ApiSpringBoot.modelos.ClassSubject;
import com.example.ApiSpringBoot.services.ClassSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/class-subjects")
@CrossOrigin("*")
public class ClassSubjectController {

    @Autowired
    private ClassSubjectService service;

    @GetMapping
    public List<ClassSubject> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ClassSubject> getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping
    public ClassSubject save(@RequestBody ClassSubject classSubject) {
        return service.save(classSubject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
