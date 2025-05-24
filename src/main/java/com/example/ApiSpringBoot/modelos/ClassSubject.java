package com.example.ApiSpringBoot.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClassSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_course")
    @JsonBackReference(value = "course-classSubject")
    private Course course;

    @OneToMany(mappedBy = "classSubject")
    @JsonManagedReference(value = "qualification")
    private List<Grade> scoreNote;
}
