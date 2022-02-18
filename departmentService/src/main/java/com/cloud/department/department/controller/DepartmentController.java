package com.cloud.department.department.controller;

import com.cloud.department.department.entity.DepartmentEntity;
import com.cloud.department.department.model.Department;
import com.cloud.department.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@PostMapping("/add")
	public Mono<Department> add(@RequestBody DepartmentEntity department) {
		return service.save(department);
	}
	
	@GetMapping("/get-by/{id}")
	public Mono<Department> findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("/findAll")
	public Flux<Department> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/college/{collegeId}")
	public Flux<Department> findByCollege(@PathVariable("collegeId") Long collegeId) {
		return service.findByCollege(collegeId);
	}

}