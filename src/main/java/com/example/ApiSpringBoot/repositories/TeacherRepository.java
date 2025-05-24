package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
