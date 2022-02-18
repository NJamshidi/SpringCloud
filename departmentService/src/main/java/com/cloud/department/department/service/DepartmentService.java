package com.cloud.department.department.service;

import com.cloud.department.department.entity.DepartmentEntity;
import com.cloud.department.department.model.Department;
import com.cloud.department.department.repository.DepartmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Function;

@Service
public class DepartmentService  {
	@Autowired
	private DepartmentRepository repository;

	public Mono<Department> save(DepartmentEntity department) {
		DepartmentEntity c = repository.save(department);
		return Mono.just(Optional.of(c).map(mapper).orElse(null));
	}

	public Flux<Department> findAll() {
		return Flux.fromIterable(repository.findAll()).map(mapper);
	}

	public Mono<Department> findById(Long id) {

		return Mono.just(repository.findById(id).map(mapper).orElse(null));
	}
	
	public Flux<Department> findByCollege(Long collegeId) {
		return Flux.fromIterable(repository.findByCollegeId(collegeId)).map(mapper);
	}

	private Function<DepartmentEntity, Department> mapper = c -> {
		Department response = new Department();
		BeanUtils.copyProperties(c, response);
		return response;
	};
	
}