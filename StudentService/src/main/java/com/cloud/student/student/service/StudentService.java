package com.cloud.student.student.service;

import com.cloud.student.student.entity.StudentEntity;
import com.cloud.student.student.model.Student;
import com.cloud.student.student.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Function;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public Mono<Student> save(StudentEntity student) {
        StudentEntity c = repository.save(student);
        return Mono.just(Optional.of(c).map(mapper).orElse(null));
    }


    public Flux<Student> findAll() {
        return Flux.fromIterable(repository.findAll()).map(mapper);
    }

    public Mono<Student> findById(Long id) {
        return Mono.just(repository.findById(id).map(mapper).orElse(null));
    }

    public Flux<Student> findByCollege(Long collegeId) {
        return Flux.fromIterable(repository.findByCollegeId(collegeId)).map(mapper);
    }

    public Flux<Student> findByDepartment(Long departmentId) {
        return Flux.fromIterable(repository.findByDepartmentId(departmentId)).map(mapper);
    }

    private Function<StudentEntity, Student> mapper = c -> {
        Student response = new Student();
        BeanUtils.copyProperties(c, response);
        return response;
    };


}
