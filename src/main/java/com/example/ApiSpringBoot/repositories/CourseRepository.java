package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
