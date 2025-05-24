package com.example.ApiSpringBoot.services;

import com.example.ApiSpringBoot.modelos.Teacher;
import com.example.ApiSpringBoot.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Integer id) {
        return teacherRepository.findById(id);
    }

    public void deleteTeacherById(Integer id) {
        teacherRepository.deleteById(id);
    }
}
