package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
