package com.example.ApiSpringBoot.controllers;

import com.example.ApiSpringBoot.modelos.Registration;
import com.example.ApiSpringBoot.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin("*")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public Optional<Registration> getRegistrationById(@PathVariable Integer id) {
        return registrationService.getRegistrationById(id);
    }

    @PostMapping
    public Registration saveRegistration(@RequestBody Registration registration) {
        return registrationService.saveRegistration(registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Integer id) {
        registrationService.deleteRegistration(id);
    }
}
