package com.cloud.department.department.repository;

import com.cloud.department.department.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
	Optional<DepartmentEntity> findById(Long id);
	List<DepartmentEntity> findByCollegeId(Long collegeId);
}