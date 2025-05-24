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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_teacher")
    @JsonBackReference(value = "teacher-course")
    private Teacher teacher;

    @OneToMany(mappedBy = "course")
    @JsonManagedReference(value = "course-registration")
    private List<Registration> registrations;

    @OneToMany(mappedBy = "course")
    @JsonManagedReference(value = "course-classSubject")
    private List<ClassSubject> classSubjects;

    @OneToMany(mappedBy = "course")
    @JsonManagedReference(value = "course-attendance")
    private List<Attendance> attendances;

}
