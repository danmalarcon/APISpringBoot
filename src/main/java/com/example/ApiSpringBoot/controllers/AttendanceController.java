package com.example.ApiSpringBoot.controllers;

import com.example.ApiSpringBoot.modelos.Attendance;
import com.example.ApiSpringBoot.services.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendances")
@CrossOrigin(origins = "*")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping
    public List<Attendance> getAllAttendances() {
        return attendanceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Attendance> getAttendanceById(@PathVariable Integer id) {
        return attendanceService.findById(id);
    }

    @PostMapping
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        return attendanceService.save(attendance);
    }

    @PutMapping("/{id}")
    public Attendance updateAttendance(@PathVariable Integer id, @RequestBody Attendance attendance) {
        attendance.setId(id);
        return attendanceService.save(attendance);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendance(@PathVariable Integer id) {
        attendanceService.deleteById(id);
    }
}
