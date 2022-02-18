package com.cloud.college.college.client;

import com.cloud.college.college.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "departmentService")
public interface DepartmentClient {

	@GetMapping("/college/{collegeId}")
	public List<Department> findByCollege(@PathVariable("collegeId") Long collegeId);
	
	@GetMapping("/college/{collegeId}/with-employees")
	public List<Department> findByCollegeWithEmployees(@PathVariable("collegeId") Long collegeId);
	
}