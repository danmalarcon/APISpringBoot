package com.example.ApiSpringBoot.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_student")
    @JsonBackReference(value = "student-registration")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_course")
    @JsonBackReference(value = "course-registration")
    private Course course;
    private LocalDate registrationDate;

}
