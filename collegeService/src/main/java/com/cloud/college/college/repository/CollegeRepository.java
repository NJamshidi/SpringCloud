package com.cloud.college.college.repository;

import com.cloud.college.college.entity.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CollegeRepository extends JpaRepository<CollegeEntity, Long> {
	public Optional<CollegeEntity> findById(Long id);
}