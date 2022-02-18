package com.cloud.student.student.repository;

import com.cloud.student.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    Optional<StudentEntity> findById(Long id);

    List<StudentEntity> findByCollegeId(Long collegeId);

    List<StudentEntity> findByDepartmentId(Long departmentId);
}
