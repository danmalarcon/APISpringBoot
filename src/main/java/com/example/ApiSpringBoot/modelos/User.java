package com.example.ApiSpringBoot.modelos;

import com.example.ApiSpringBoot.ayudas.UserType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phone;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;

    //Relacion con Student
    @OneToOne(mappedBy = "user")
    @JsonManagedReference(value = "user-student")
    private Student student;

    //Relacion con Teacher
    @OneToOne(mappedBy = "user")
    @JsonManagedReference(value = "user-teacher")
    private Teacher teacher;

}
