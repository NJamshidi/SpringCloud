package com.cloud.student.student.controller;

import com.cloud.student.student.entity.StudentEntity;
import com.cloud.student.student.model.Student;
import com.cloud.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class StudentController {


    @Autowired
    StudentService service;

    @PostMapping("/add")
    public Mono<Student> add(@RequestBody StudentEntity st) {
        return service.save(st);
    }

    @GetMapping("/get-by/{id}")
    public Mono<Student> findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("/findAll")
    public Flux<Student> findAll() {
        return service.findAll();
    }

    @GetMapping("/department/{departmentId}")
    public Flux<Student> findByDepartment(@PathVariable("departmentId") Long departmentId) {
        return service.findByDepartment(departmentId);
    }

    @GetMapping("/college/{collegeId}")
    public Flux<Student> findByCollege(@PathVariable("collegeId") Long collegeId) {
        return service.findByCollege(collegeId);
    }

}