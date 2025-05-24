package com.example.ApiSpringBoot.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_user")
    @JsonBackReference(value = "user-student")
    private User user;
    private int grade;

    @Column(name = "birth_date")
    private LocalDate birthDate;
    private String street;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference(value = "student-registration")
    private List<Registration> registrations;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference(value = "student-note")
    private List<Grade> grades;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference(value = "student-attendance")
    private List<Attendance> attendances;

}
