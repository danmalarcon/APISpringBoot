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
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_user")
    @JsonBackReference(value = "user-teacher")
    private User user;
    private String specialty;

    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference(value = "teacher-course")
    private List<Course> courses;

}
