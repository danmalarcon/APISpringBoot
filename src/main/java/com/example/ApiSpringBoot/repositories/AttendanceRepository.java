package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}
