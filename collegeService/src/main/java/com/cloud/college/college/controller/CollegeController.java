package com.cloud.college.college.controller;

import com.cloud.college.college.client.DepartmentClient;
import com.cloud.college.college.client.EmployeeClient;
import com.cloud.college.college.entity.CollegeEntity;
import com.cloud.college.college.model.College;
import com.cloud.college.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {

	@Autowired
	private CollegeService service;
	@Autowired
	private DepartmentClient departmentClient;
	@Autowired
	private EmployeeClient employeeClient;
	
	@PostMapping("/add")
	public College add(@RequestBody CollegeEntity college) {
		return service.save(college);
	}
	
	@GetMapping("/findAll")
	public List<College> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/get-by/{id}")
	public College findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@GetMapping("/{id}/with-departments")
	public College findByIdWithDepartments(@PathVariable("id") Long id) {
		College college = service.findById(id);
		college.setDepartments(departmentClient.findByCollege(college.getId()));
		return college;
	}
	
	@GetMapping("/{id}/with-departments-and-employees")
	public College findByIdWithDepartmentsAndEmployees(@PathVariable("id") Long id) {
		College college = service.findById(id);
		college.setDepartments(departmentClient.findByCollegeWithEmployees(college.getId()));
		return college;
	}
	
	@GetMapping("/{id}/with-employees")
	public College findByIdWithEmployees(@PathVariable("id") Long id) {
		College college = service.findById(id);
		college.setEmployees(employeeClient.findByCollege(college.getId()));
		return college;
	}
	
}