package com.example.ApiSpringBoot.modelos;

import com.example.ApiSpringBoot.ayudas.AttendanceStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_student")
    @JsonBackReference(value = "student-attendance")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_course")
    @JsonBackReference(value = "course-attendance")
    private Course course;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus attendanceStatus;

}
