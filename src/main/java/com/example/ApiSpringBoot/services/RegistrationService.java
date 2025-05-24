package com.example.ApiSpringBoot.services;

import com.example.ApiSpringBoot.modelos.Registration;
import com.example.ApiSpringBoot.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public Optional<Registration> getRegistrationById(Integer id) {
        return registrationRepository.findById(id);
    }

    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    public void deleteRegistration(Integer id) {
        registrationRepository.deleteById(id);
    }
}
