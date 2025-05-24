package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
