package com.example.ApiSpringBoot.services;

import com.example.ApiSpringBoot.modelos.ClassSubject;
import com.example.ApiSpringBoot.repositories.ClassSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassSubjectService {

    @Autowired
    private ClassSubjectRepository repository;

    public List<ClassSubject> getAll() {
        return repository.findAll();
    }

    public Optional<ClassSubject> getById(Integer id) {
        return repository.findById(id);
    }

    public ClassSubject save(ClassSubject classSubject) {
        return repository.save(classSubject);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
