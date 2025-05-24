package com.example.ApiSpringBoot.repositories;

import com.example.ApiSpringBoot.modelos.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}
