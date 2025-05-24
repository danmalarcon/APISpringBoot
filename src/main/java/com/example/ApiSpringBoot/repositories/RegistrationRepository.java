package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
}
