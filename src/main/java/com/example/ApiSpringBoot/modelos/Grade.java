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
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_student")
    @JsonBackReference(value = "student-note")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_subject")
    @JsonBackReference(value = "qualification")
    private ClassSubject classSubject;

    private float score;
    private LocalDate evaluationDate;
}
