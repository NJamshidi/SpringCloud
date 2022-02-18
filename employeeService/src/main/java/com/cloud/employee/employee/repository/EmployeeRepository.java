package com.cloud.employee.employee.repository;

import com.cloud.employee.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	Optional<EmployeeEntity> findById(Long id);

	List<EmployeeEntity> findByCollegeId(Long collegeId);

	List<EmployeeEntity> findByDepartmentId(Long departmentId);
}