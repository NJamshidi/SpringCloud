package com.cloud.employee.employee.controller;

import com.cloud.employee.employee.entity.EmployeeEntity;
import com.cloud.employee.employee.model.Employee;
import com.cloud.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {


	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public Mono<Employee> add(@RequestBody EmployeeEntity employee) {
		return service.save(employee);
	}
	
	@GetMapping("/get-by/{id}")
	public Mono<Employee> findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("/findAll")
	public Flux<Employee> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/department/{departmentId}")
	public Flux<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
		return service.findByDepartment(departmentId);
	}
	
	@GetMapping("/college/{collegeId}")
	public Flux<Employee> findByCollege(@PathVariable("collegeId") Long collegeId) {
		return service.findByCollege(collegeId);
	}
	
}